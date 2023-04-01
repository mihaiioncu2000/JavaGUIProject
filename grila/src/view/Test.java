package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Group;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;

import model.Category;
import model.Config;
import model.Difficulty;
import model.Exercise;
import services.ExercisesProvider;
import services.ScoreCalculator;
import view.components.Question;

public class Test implements PropertyChangeListener {
	private JFrame frame;
	private JProgressBar progressBar = new JProgressBar();
	JPanel componentToScroll = new JPanel();
	JButton btnSubmit = new JButton("Submit");

	private Task task;
	private Difficulty difficulty;
	private Category category;
	private List<Question> questionsToBeEvaluated = new LinkedList<Question>();
	int progress = 0;

	class Task extends SwingWorker<Void, Void> {

		@Override
		public Void doInBackground() {

			// Initialize progress property.
			setProgress(0);
			while (progress < difficulty.getMaxTime()) {
				// Sleep for up to one second.
				try {
					Thread.sleep(1000);
				} catch (InterruptedException stopped) {
					return null;
				}
				progress++;
				setProgress(progress);

			}
			return null;
		}

		@Override
		public void done() {
			finishActions();
		}
	}

	/**
	 * Create the application.
	 */
	public Test(Difficulty difficulty, Category category) {
		this.difficulty = difficulty;
		this.category = category;

		initialize();
		frame.setVisible(true);

		task = new Task();
		task.addPropertyChangeListener(this);
		task.execute();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(Config.posX, Config.posY, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 43, 634, 481);
		frame.getContentPane().add(scrollPane);

//
//		scrollPane.setViewportView(componentToScroll);
//
//		GroupLayout gl_panel = new GroupLayout(componentToScroll);
//		JPanel question = new Question(new Exercise("a", null, Category.COMPUTERSCIENCE), 1);
//		JPanel question2 = new Question(new Exercise("a", null, Category.COMPUTERSCIENCE), 1);
//
//		gl_panel.setVerticalGroup(gl_panel.createSequentialGroup()
//				.addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(question))
//				.addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(question2)));
//		gl_panel.setHorizontalGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
//				.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(question).addComponent(question2)));

		// START custom code
		scrollPane.setViewportView(componentToScroll);

		GroupLayout gl_panel = new GroupLayout(componentToScroll);

		SequentialGroup verticalGroup = gl_panel.createSequentialGroup();
		Group horizontalGroup = gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING);
		gl_panel.setVerticalGroup(verticalGroup);
		gl_panel.setHorizontalGroup(gl_panel.createSequentialGroup().addGroup(horizontalGroup));

		int index = 1;
		for (Exercise exercise : ExercisesProvider.getExercosesByCategory(category, difficulty)) {
			Question question = new Question(exercise, index++);
			verticalGroup.addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(question));
			horizontalGroup.addComponent(question);
			questionsToBeEvaluated.add(question);
		}
		// FINISH custom code
		componentToScroll.setLayout(gl_panel);

		progressBar.setBounds(10, 11, 614, 21);
		progressBar.setStringPainted(true);
		progressBar.setString("0 / " + difficulty.getMaxTime());
		frame.getContentPane().add(progressBar);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishActions();
			}
		});
		btnSubmit.setBounds(270, 523, 98, 26);
		frame.getContentPane().add(btnSubmit);
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if ("progress" == evt.getPropertyName()) {
			int progress = (Integer) evt.getNewValue();
			progressBar.setValue((progress * 100) / difficulty.getMaxTime());
			progressBar.setString(progress + " / " + difficulty.getMaxTime());

		}
	}

	private void finishActions() {
		Toolkit.getDefaultToolkit().beep();
		task.cancel(true);
		disableComponents(frame);
		showFinishPopup();
	}

	private void disableComponents(Container container) {
		Component[] components = container.getComponents();
		for (Component component : components) {
			component.setEnabled(false);
			if (component instanceof Container) {
				disableComponents((Container) component);
			}
		}
	}

	private void showFinishPopup() {
		int score = ScoreCalculator.calculateScore(questionsToBeEvaluated);
		String message = progress == difficulty.getMaxTime() ? "Time's up.\n" : "";
		int messageType;

		if (score >= Config.pointsToPass) {
			message += "You passed!";
			messageType = JOptionPane.PLAIN_MESSAGE;
		} else {
			message += "You failed.";
			messageType = JOptionPane.ERROR_MESSAGE;
		}
		JOptionPane.showMessageDialog(frame,
				message + "\nTotal score: " + score + ". Minimum to pass " + Config.pointsToPass, "Result",
				messageType);
		System.exit(0);
	}

}

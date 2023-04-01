package view.components;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.Map.Entry;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import model.Exercise;

public class Question extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public Question(Exercise exercise, int order) {
//		
//		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		setLayout(new GridLayout(0, 1, 0, 0));
//
//		JLabel lblNewLabel = new JLabel("Who was the first president");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
//		add(lblNewLabel);
//
//		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
//		buttonGroup.add(rdbtnNewRadioButton);
//		add(rdbtnNewRadioButton);
//
//		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
//		buttonGroup.add(rdbtnNewRadioButton_2);
//		add(rdbtnNewRadioButton_2);
//
//		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
//		buttonGroup.add(rdbtnNewRadioButton_1);
//		add(rdbtnNewRadioButton_1);
//
//		JRadioButton rdbtnSdgdsfg = new JRadioButton("sdgdsfg");
//		buttonGroup.add(rdbtnSdgdsfg);
//		add(rdbtnSdgdsfg);
		// END DEFAULT CODE

		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel = new JLabel(order + ") " + exercise.getQuestion());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(lblNewLabel);

		for (Entry<String, Integer> entry : exercise.getAnswers().entrySet()) {
			JRadioButton rdbtnNewRadioButton = new JRadioButton(entry.getKey());
			rdbtnNewRadioButton.setActionCommand(entry.getValue().toString());
			buttonGroup.add(rdbtnNewRadioButton);
			add(rdbtnNewRadioButton);
		}

	}

	public int getPoints() {
		if (buttonGroup.getSelection() == null)
			return 0;
		return Integer.parseInt(buttonGroup.getSelection().getActionCommand());
	}

}

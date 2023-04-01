package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import control.NextButtonEnabler;
import model.Category;
import model.Config;
import model.Difficulty;

public class SettingsSelection {

	private JFrame frame;
	private final ButtonGroup dificultateButtonGroup = new ButtonGroup();
	private final ButtonGroup categorieButtonGroup = new ButtonGroup();
	private final JButton btnNewButton = new JButton("Start Test");

	/**
	 * Create the application.
	 */
	public SettingsSelection() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(Config.posX, Config.posY, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Setari");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(162, 11, 82, 36);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dificultate:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(59, 69, 71, 24);
		frame.getContentPane().add(lblNewLabel_1);

		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Greu");
		rdbtnNewRadioButton_2
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		dificultateButtonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setForeground(new Color(255, 0, 0));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(59, 158, 103, 21);
		rdbtnNewRadioButton_2.setActionCommand(Difficulty.HARD.toString());
		frame.getContentPane().add(rdbtnNewRadioButton_2);

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Test(Difficulty.valueOf(dificultateButtonGroup.getSelection().getActionCommand()),
						Category.valueOf(categorieButtonGroup.getSelection().getActionCommand()));
				frame.dispose();
			}
		});
		btnNewButton.setBounds(243, 218, 95, 21);
		frame.getContentPane().add(btnNewButton);

		JButton btnButtonNum1 = new JButton("Back");
		btnButtonNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				frame.dispose();
			}
		});
		btnButtonNum1.setBounds(110, 218, 95, 21);
		frame.getContentPane().add(btnButtonNum1);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Usor");
		rdbtnNewRadioButton
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		dificultateButtonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(102, 204, 51));
		rdbtnNewRadioButton.setBounds(59, 105, 85, 24);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setActionCommand(Difficulty.EASY.toString());
		frame.getContentPane().add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mediu");
		rdbtnNewRadioButton_1
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		dificultateButtonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setForeground(new Color(204, 204, 51));
		rdbtnNewRadioButton_1.setBounds(59, 131, 82, 24);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setActionCommand(Difficulty.MEDIUM.toString());
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnComputerScience = new JRadioButton("Computer Science");
		rdbtnComputerScience
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		categorieButtonGroup.add(rdbtnComputerScience);
		rdbtnComputerScience.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnComputerScience.setBounds(267, 105, 132, 21);
		rdbtnComputerScience.setActionCommand(Category.COMPUTING.toString());
		frame.getContentPane().add(rdbtnComputerScience);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Istorie");
		rdbtnNewRadioButton_1_1
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		categorieButtonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1.setBounds(267, 128, 103, 24);
		rdbtnNewRadioButton_1_1.setActionCommand(Category.HISTORY.toString());
		frame.getContentPane().add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Geografie");
		rdbtnNewRadioButton_1_1_1
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		categorieButtonGroup.add(rdbtnNewRadioButton_1_1_1);
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1_1.setBounds(267, 154, 103, 24);
		rdbtnNewRadioButton_1_1_1.setActionCommand(Category.GEOGRAPHY.toString());
		frame.getContentPane().add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Literatura");
		rdbtnNewRadioButton_1_2
				.addActionListener(new NextButtonEnabler(categorieButtonGroup, dificultateButtonGroup, btnNewButton));
		categorieButtonGroup.add(rdbtnNewRadioButton_1_2);
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_2.setBounds(267, 182, 103, 24);
		rdbtnNewRadioButton_1_2.setActionCommand(Category.LITERATURE.toString());
		frame.getContentPane().add(rdbtnNewRadioButton_1_2);

		JLabel lblNewLabel_1_1 = new JLabel("Categoria:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(257, 69, 71, 24);
		frame.getContentPane().add(lblNewLabel_1_1);

	}
}

package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import model.Config;
import services.Authenticator;

public class Login {

	public JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.setBounds(Config.posX, Config.posY, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(200, 32, 45, 22);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(83, 100, 72, 22);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(83, 145, 72, 22);
		frame.getContentPane().add(lblPassword);

		txtUsername = new JTextField();
		txtUsername.setBounds(165, 102, 147, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(165, 147, 147, 22);
		frame.getContentPane().add(txtPassword);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Authenticator.verifyLogin(txtUsername.getText(), txtPassword.getPassword())) {
					new SettingsSelection();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					resetLoginFields();
				}

			}
		});
		btnNewButton.setBounds(61, 208, 85, 21);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetLoginFields();

			}
		});
		btnNewButton_1.setBounds(190, 208, 85, 21);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm Exit", "Login System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		btnNewButton_2.setBounds(316, 208, 85, 21);
		frame.getContentPane().add(btnNewButton_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(61, 187, 342, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(61, 78, 342, 2);
		frame.getContentPane().add(separator_1);
	}

	private void resetLoginFields() {
		txtPassword.setText(null);
		txtUsername.setText(null);
	}
}

package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class NextButtonEnabler implements ActionListener {
	private ButtonGroup g1;
	private ButtonGroup g2;
	private JButton nextButton;

	public NextButtonEnabler(ButtonGroup g1, ButtonGroup g2, JButton nextButton) {
		this.g1 = g1;
		this.g2 = g2;
		this.nextButton = nextButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (g1.getSelection() != null && g2.getSelection() != null && !nextButton.isEnabled())
			nextButton.setEnabled(true);
	}

}

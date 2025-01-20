package java_esi.db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		String s= b.getText();
		switch (s) {
		case "cancel":
			System.exit(0);
			break;
		case "clear":
			//effacer les zonne de textes
			break;

		default:
			System.out.println("autre actions...");
			break;
		}

	}

}

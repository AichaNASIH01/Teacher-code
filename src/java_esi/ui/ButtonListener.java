package java_esi.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonListener implements ActionListener {
	private Form frame;

	public ButtonListener() {

	}
	public ButtonListener(Form w) {
		this.frame=w;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object src=e.getSource();
		if (e.getSource() instanceof JButton) {
			JButton b= (JButton)e.getSource();
			String s =b.getText();
			switch (s) {
			case "Ok":
				System.out.println(" les données saisies sont:");
				for (int i = 0; i < frame.getTextFields().length; i++) {
					System.out.println(frame.getTextFields()[i]);
				}
				break;

			case "Clear":
				System.out.println(" vous avez appuyer sur clear");
				frame.clearTextFields();
				break;
			case "Cancel":
				System.out.println(" vous avez appuyer sur Annuler");
				System.exit(0);
				break;
			default:
				System.out.println("Vous avez appuyer sur un autre boutton");
				break;
			}
		}

	}

}

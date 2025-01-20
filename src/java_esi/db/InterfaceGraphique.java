package java_esi.db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGraphique {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Premiere fenetre");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JButton b = new JButton("Fermer");
		p1.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b= (JButton) e.getSource();
				switch (b.getText()) {
				case "Fermer":
					System.exit(0);
					break;

				default:
					break;
				}
				
			}
		});
		
		JPanel pp= (JPanel) f.getContentPane();
		pp.add(p1);
		f.setSize(200,300);
		//f.pack();
		f.setVisible(true);
		
		
		
		
		
		
	}

}

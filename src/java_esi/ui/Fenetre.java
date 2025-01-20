package java_esi.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
		f.setTitle("First Jframe");
		//f.setSize(300,400);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//récuperer le panneau principal
		JPanel panneau=(JPanel)f.getContentPane();
		//crééer un boutton
		
		
		JLabel nl =new JLabel("Login");
		JTextField z1 = new JTextField(30);
		JPanel p1= new JPanel(new FlowLayout());
		p1.add(nl);
		p1.add(z1);
		
		System.out.println(""+BorderLayout.NORTH);
		
		JLabel np =new JLabel("pwd");
		JPasswordField z2 = new JPasswordField(30);
		JPanel p2= new JPanel(new FlowLayout());
		p2.add(np);
		p2.add(z2);
		
		//ajouter le bouton au panneau
		panneau.setLayout(new GridLayout(3,1));
		panneau.add(p1);
		panneau.add(p2);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton enter= new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b =(JButton) e.getSource();
				switch (b.getText()) {
				case "Enter":
					System.out.println("ok");
					break;

				default:
					break;
				}
								
			}
		});
		f.pack();
		f.setVisible(true);

	}

}

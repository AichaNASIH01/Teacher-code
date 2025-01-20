package java_esi.ui;

//import java.rmi.activation.ActivationGroupID;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class ButtonPanel extends JPanel {
	
	public ButtonPanel(String[] names) {
		for (int i = 0; i < names.length; i++) {
			add(new JButton(names[i]));
		}
	}
	public ButtonPanel(String[] names, int lin, int col) {
		this(names);
		setLayout(new GridLayout(lin,col));

	}
	public void setActionListener(ActionListener al) {
		Component[] cps=getComponents();
		for (int i = 0; i < cps.length; i++) {
			if (cps[i] instanceof JButton) {
				JButton b = (JButton) cps[i];
				b.addActionListener(al);
			}
		}
	}

}

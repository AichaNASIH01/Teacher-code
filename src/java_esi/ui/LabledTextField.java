package java_esi.ui;

import javax.swing.*;
import java.awt.*;

public class LabledTextField extends JPanel {
	private JLabel label;
	private JTextField field;
	
	public LabledTextField() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
	}
	public LabledTextField(String lab, int size) {
		this();
		label= new JLabel(lab);
		field= new JTextField(size);
		add(label);
		add(field);
		label.setPreferredSize(new Dimension(120,20));
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextField getField() {
		return field;
	}

	public void setField(JTextField field) {
		this.field = field;
	}
	public void clear() {
		field.setText("");
	}
	public String getTextField() {
		return field.getText();
	}
		

}

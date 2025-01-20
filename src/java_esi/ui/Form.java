package java_esi.ui;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Form extends JPanel {
	private Item item;
	public Form() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public Form(Item item) {
		this();
		for (int i = 0; i < item.getFieldsCount(); i++) {
			add(new LabledTextField(item.getLabelField(i), item.getTextFieldSize(i)));
		}
	
	}
	public void addField(String f, int s) {
		add(new LabledTextField(f, s));
	}
	public void clearTextFields() {
		Component[] comps=getComponents();
		for (int i = 0; i < comps.length; i++) {
			LabledTextField ltf =(LabledTextField) comps[i];
			ltf.clear();
		}
	}
	public String[] getTextFields() {
		Component[] comps=getComponents();
		String[] txt= new String[comps.length];
		for (int i = 0; i < comps.length; i++) {
			LabledTextField ltf =(LabledTextField) comps[i];
			txt[i]=ltf.getTextField();
		}
		return txt;
	}

}

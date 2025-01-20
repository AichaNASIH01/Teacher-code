package java_esi.db;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JButtonPanel extends JPanel {
	private String[] names;
	
	public JButtonPanel(String[] names) {
		this.names=names;
		
		for (int i = 0; i < names.length; i++) {
			add(new JButton(names[i]));
			
		}
		
		
	}

}

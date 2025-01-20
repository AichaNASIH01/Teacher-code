package java_esi.ui;

import java.util.Iterator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame  implements ActionListener{
	private JPanel pane;
	private JPanel pcenter;
	private Form form;
	public Window() {
		pane= (JPanel)getContentPane();
		//exBorderLayout();
		//exFlowLayout();
		//exButtonPanel();
		exForm();
		
		pack();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void exBorderLayout() {
		
		String[] pos= {"North", "South","East","West","Center"};
		pane.setLayout(new BorderLayout(10,10));
		for (int i = 0; i < pos.length; i++) {
			pane.add(new JButton(pos[i]),pos[i]);
		}
		//pack();
		//setSize(300,400);
		
	}
	public void exButtonPanel() {
		String[] names= {"nom", "prenom", "adresse", "telephone"};
		int[] sizes= {20, 20, 30, 20};
		
		String[] bts= {"Ok", "Clear","Cancel"};

		pcenter=new JPanel();
		pcenter.setLayout(new GridLayout(names.length,1));
		for (int i = 0; i < names.length; i++) {
			pcenter.add(new LabledTextField(names[i],sizes[i]));
		}
		pane.add(pcenter, BorderLayout.CENTER);

		ButtonPanel bp = new ButtonPanel(bts);	
		pane.add(bp, BorderLayout.SOUTH);
		
		//ButtonListener al = new ButtonListener(this);
		//bp.setActionListener(al);
		
		
		
	}
	
	public void exForm() {
		// créer le formulaire
		Produit p = new Produit("TV", 7000, 10);
		Form f = new Form(p);
		pane.add(f, BorderLayout.CENTER);
		
		// bouttons à mettre dans la frame
		String[] bts= {"Ok", "Clear","Cancel"};
		ButtonPanel bp = new ButtonPanel(bts);	
		pane.add(bp, BorderLayout.SOUTH);
		JButton b= new JButton("EXIT");
		
		pane.add(b,BorderLayout.NORTH);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//les actions à faire pour chaque boutton
		ButtonListener al = new ButtonListener(f);
		bp.setActionListener(al);

	}
	public void clearTextFields() {
		Component[] comps=pcenter.getComponents();
		for (int i = 0; i < comps.length; i++) {
			LabledTextField ltf =(LabledTextField) comps[i];
			ltf.clear();
		}
	}
	public String[] getTextFields() {
		Component[] comps=pcenter.getComponents();
		String[] txt= new String[comps.length];
		for (int i = 0; i < comps.length; i++) {
			LabledTextField ltf =(LabledTextField) comps[i];
			txt[i]=ltf.getTextField();
		}
		return txt;
	}
	public void exFlowLayout() {
		
	}
	

	public static void main(String[] args) {
		new Window();
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

}

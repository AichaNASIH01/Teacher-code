import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import java_esi.Chien;

@SuppressWarnings("unused")
public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chien c1 = new Chien("max", 10);
		Chien c2= new Chien("eli", 2);
		Chien c3= new Chien("eli", 20);

		if(c1.compareTo(c2)==0) {
			System.out.println("les deux chiens ont le meme age");
		}else
			System.out.println("les chiens ont des ages differents");
		
		if(c1.equals(c2)) {
			System.out.println("meme age");
		}else
			System.out.println("ages differents");
		
		
		Vector<Chien> vv= new Vector<Chien>();
		vv.add(c3);
		System.out.println(vv.size());
		vv.remove(0);
		System.out.println(vv.size());
		for (int i=0; i<vv.size();i++ ) {
			Chien chien = (Chien) vv.get(i);
			
		}
		
		LinkedList<Chien> ll= new LinkedList<Chien>();
		ll.add(c3);
		//Iterator r= ll.iterator();
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			Chien chien = (Chien) iterator.next();
			
		}
		
		
					
	

	}

}

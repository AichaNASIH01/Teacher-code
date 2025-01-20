package java_esi.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainRW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				BufferedReader in= new BufferedReader(new FileReader("proverbes.txt"));
				String ligne=null;
				int i=1;
				while((ligne=in.readLine())!=null){
					System.out.println("ligne"+i+":"+ligne);
					String[] arg=ligne.split(";");
					// Auteur a= new Auteur(arg[0],arg[1],arg[2]);
					//auteurs.put(,a)
					i++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}finally {
				
			}
				


	}

}

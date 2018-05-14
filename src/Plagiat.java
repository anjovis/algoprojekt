import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Plagiat {
	
	public static int counter;
	

	public static Hash readFile(String filnamn) {

		Hash keys = new Hash();
		keys = readKeys();
		File fil = new File(filnamn);
		Hash hfil = new Hash();
		//hfil.add("anja");
		//keys.print();
		
		try {

			Scanner sc = new Scanner(fil);
			
			while(sc.hasNext()) {
				String ord = sc.next();
				if(keys.find(ord) == -1) {
					hfil.add(ord);
				}
				counter++;
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return hfil;
		
		

	}
	public static Hash readKeys() {
		File file = new File("keys.txt");
		
		Hash keyHash = new Hash();
		String temp="";
		try {
			Scanner scan =new Scanner(file);
			
			while(scan.hasNext()) {
				temp = scan.next();
				keyHash.add(temp);
			}
			scan.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Filen kan inte hittas");
		}
		return keyHash;
	}
	
	
	public static double compareFile(Hash fil1, Hash fil2) {
		
		int f1 = fil1.size();
		int f2 = fil2.size();
		int l = 0;
		int totLika = 0;
		double procent=0;
		int tot = counter;
		
		
		if(f1 < f2) {
			l = f1;
		}
		else {
			l = f2;
		}
		for(int i=0; i<l; i++) {
			
			String ord = fil1.getWord(i);
			int index = fil2.find(ord);
			int antal1 = fil1.getInt(i);
			int antal2 = fil2.getInt(index);
			
			if(antal1 > antal2) {
				int lika = antal1-(antal1-antal2);
				totLika = totLika + lika;
			}
			else {
				int lika = antal2-(antal2-antal1);
				totLika = totLika + lika;
			}
		}
		procent = totLika/tot;
		return procent;
	}
	
	
	public static void main (String [] args) {
		
		/*
		Scanner scan=new Scanner( System.in);
		System.out.println("Ange filens namn");
		String fileName=scan.next();
		scan.close();
		readFile(fileName);*/
		
		Hash keys = new Hash();
		keys = readFile("test3.txt");
		keys.print();
		
		
		
	}
	
	

}
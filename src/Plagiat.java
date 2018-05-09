import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Plagiat {


	public static Hash readFile(String filnamn) {

		
		File fil = new File(filnamn);
		Hash hfil = new Hash();
		
		try {

			Scanner sc = new Scanner(fil);
			
			while(sc.hasNext()) {
				String ord = sc.next();
				hfil.add(ord,Hash.hashCode(ord));
			}

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
	
	public static double compareFile(Hash fil1, Hash fil2) {
		
		int f1 = fil1.size();
		int f2 = fil2.size();
		int l = 0;
		
		if(f1 < f2) {
			l = f1;
		}
		else {
			l = f2;
		}
		for(int i=0; i<l; i++) {
			
			
			
		}
		
	}
	
	
	public static void main (String [] args) {
		
		
		
		Scanner scan=new Scanner( System.in);
		System.out.println("Ange filens namn");
		String fileName=scan.next();
		scan.close();
		readFile(fileName);
		
	}
	
	

}
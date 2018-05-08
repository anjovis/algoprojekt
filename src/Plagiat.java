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
				hfil.add(ord,hashCode(ord));
			}
	
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
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
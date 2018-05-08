import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Plagiat {
	
<<<<<<< HEAD

	public static Hash readFile(String filnamn) {
=======
	
	
	public static void main (String [] args) {
>>>>>>> master
		
		File fil = new File(filnamn);
		Hash hfil = new Hash();
		
		try {
			
<<<<<<< HEAD
			Scanner sc = new Scanner(fil);
			
			while(sc.hasNext()) {
				String ord = sc.next();
				hfil.add(ord,hashCode(ord));
			}
	
=======
			String filnamn1 = "";
			String filnamn2 = "";
			
			fr = new FileReader(filnamn1);
			br = new BufferedReader(fr);

			
>>>>>>> master
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
<<<<<<< HEAD
=======
		
>>>>>>> master
	}
	
	
	public static void main (String [] args) {
		
		
		
		Scanner scan=new Scanner( System.in);
		System.out.println("Ange filens namn");
		String fileName=scan.next();
		scan.close();
		readFile(fileName);
		
	}
	
	

}
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

<<<<<<< Updated upstream
=======
			
<<<<<<< Updated upstream
>>>>>>> master
=======
<<<<<<< Updated upstream
=======
			
			//blablablbalablablablbalbalbalabl
			
>>>>>>> Stashed changes
>>>>>>> Stashed changes
>>>>>>> Stashed changes
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
<<<<<<< Updated upstream

=======
<<<<<<< Updated upstream
		
<<<<<<< HEAD
=======
		
<<<<<<< Updated upstream
>>>>>>> master
=======
=======
		//kuljul
		//heeeeej test p� det
		//okej bajs
>>>>>>> Stashed changes
>>>>>>> Stashed changes
>>>>>>> Stashed changes
	}
	
	
	public static void main (String [] args) {
		
		
		
		Scanner scan=new Scanner( System.in);
		System.out.println("Ange filens namn");
		String fileName=scan.next();
		scan.close();
		readFile(fileName);
		
	}
	
	

}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Plagiat {

	public static int counter;

	/**
	 * readFile tar in en java fil och gör om hela filen till en lång sträng.
	 * @param String filnamn
	 * @return String line
	 */
	public static String readFile(String filnamn) {

		String line ="";
		try {
			FileReader fil = new FileReader(filnamn);
			BufferedReader reader = new BufferedReader(fil);

			while(reader.ready()) {
				line = line + reader.readLine();

			}
			reader.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	/**
	 * readKeys läser in filen med alla nyckelord och lägger in dom i en hash.
	 * @return Hash keyHash
	 */
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
	
	/**
	 * splitString splittar strängen som innehåller filen och lägger varje ord på varsinn plats i en string-array, 
	 * den splittar på alla "vanliga tecken" som t.ex.  . - { ( osv.
	 * @param String line
	 * @return String[] strArr
	 */
	public static String[] splitString(String line) {
		String[] strArr = line.split("\\W+");
		counter = counter+ strArr.length;
		return strArr;
	}
	
	/**
	 * arrToHash kollar om ordet i String[] är ett nyckelord, om det inte är det addar jag ordet till Hash-objektet.
	 * @param String[] words
	 * @return Hash hfil
	 */
	public static Hash arrToHash(String [] words) {
		Hash keys = readKeys();
		Hash hfil = new Hash();

		for (int i =0;i<words.length;i++) {
			if(keys.find(words[i]) == -1) {
				hfil.add(words[i]);
			}
		}
		return hfil;

	}

	/**
	 * compareFile jämför två Hash-objekt för att se hur många identifierare som är lika.
	 * @param Hash fil1, Hash fil2
	 * @return double procent
	 */
	public static double compareFile(Hash fil1, Hash fil2) {

		double totLika = 0;
		double procent=0;
		double tot = counter;

		for(int i=0; i<10007; i++) {

			String ord = fil1.getWord(i);
			int index = fil2.find(ord);
			int antal1 = fil1.getInt(i);
			int antal2 = fil2.getInt(index);

			if(antal1 != 0 && antal2 != 0 && ord != null && index != -1) {
				if(antal1 > antal2) {
					int lika = (antal1-(antal1-antal2))*2;
					totLika = totLika + lika;
				}
				else if(antal1 == antal2) {
					totLika = totLika + antal1 + antal2;


				}
				else {
					int lika = (antal2-(antal2-antal1))*2;
					totLika = totLika + lika;
				}
			}
		}
		procent = (totLika/tot)*100; 
		return procent;
	}


	public static void main (String [] args) {

		Hash klar = arrToHash(splitString(readFile("ArrayStack.java")));
		Hash klar2 = arrToHash(splitString(readFile("ArrayQueue.java")));
		
		System.out.println(Math.floor(compareFile(klar,klar2))+" % är plagierat");

	}



}
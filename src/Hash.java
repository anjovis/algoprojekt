
public class Hash {


<<<<<<< Updated upstream
	private static String[][] hashArray;
    private int value;
=======
	private String[][] hashArray;
>>>>>>> Stashed changes
     
	public Hash() {
<<<<<<< Updated upstream
		hashArray =  new String[10007][];
=======
		hashArray =  new String[10][];

>>>>>>> Stashed changes

	}
	
	public static int hashC(String o) {
		
		int a = o.hashCode();
		int b = a % hashArray.length;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();
		
		System.out.println(hashC("hej"));
		System.out.println(hashC("0"));
		
//		hej.add(hashCode("hej"));
//		hej.add(hashCode("hej"));
//		hej.add(hashCode("hej"));
//		hej.add(hashCode("hej"));
		
		
	}
<<<<<<< Updated upstream
	//om arrayen �r full dubblera, kalla p� hashcode och l�gg in p� hascode (index) platsen .  
	public void add(int value){
=======
	 
	public void add(String word, int value){
>>>>>>> Stashed changes

		
	}
	
	public int size(){	
		return hashArray.length;
	}
	
	

}


public class Hash {


	private static String[][] hashArray;
    private int value;
     
	public Hash() {
		hashArray =  new String[10007][];

	}
	
	public static int hashC(String o) {		
		int a = o.hashCode();
		int b = a % hashArray.length;		
		return b;
<<<<<<< HEAD
		
	}
	
	
	//om arrayen �r full dubblera, kalla p� hashcode och l�gg in p� hascode (index) platsen .  
	public void add(String o,int value){
		String hej = hashArray[value];
		if(o.compareTo(hashArray[value])==0) {
			
			
		}
		
=======
>>>>>>> master
		
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();		
		System.out.println(hashC("hej"));
		System.out.println(hashC("0"));
<<<<<<< HEAD
		
		
		
=======

	public int hashC(String o) {
		
		hej.contains("hej");
		
		
	}

	public void add(String word, int value){

		
	}
	public boolean contains(String word){

   
		
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	

}


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
		
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();
		
		System.out.println(hashC("hej"));
		System.out.println(hashC("0"));
		
		
		
		
	}
	//om arrayen �r full dubblera, kalla p� hashcode och l�gg in p� hascode (index) platsen .  
	public void add(int value){

   
		
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	

}

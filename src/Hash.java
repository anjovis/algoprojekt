
public class Hash {


	private static String[] hashArray;
	private static int[] hashArrInt;
	
	public Hash() {
		hashArray =  new String[10007];
		hashArrInt = new int[10007];

	}
	
	public static int hashC(String o) {
		
		int a = o.hashCode();
		int b = a % hashArray.length;
		
		return b;
		
	}
	
	
	//om arrayen �r full dubblera, kalla p� hashcode och l�gg in p� hascode (index) platsen .  
	public void add(String o,int value){
		String hej = hashArray[value];
		if(o.compareTo(hashArray[value])==0) {
			
			
		}
		
		
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();
		
		System.out.println(hashC("hej"));
		System.out.println(hashC("0"));
		
		
		
		
	}
	
	

}

import java.util.Iterator;

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
	
	public void add(String o,int value){
		String hej = hashArray[value];
		if(o.compareTo(hashArray[value])==0) {
			
		}

	}
	
	public String getWord(int i){
		String it = hashArray[i];
		return it;
	}
	
	public int getIndex(int i){
		int it = hashArrInt[i];
		return it;
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

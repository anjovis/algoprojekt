
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

	public int hashC(String o) {
		
		hej.contains("hej");
		
		
	}

	public void add(String word, int value){

		
	}
	public boolean contains(String word){

		for(int i = 0; i < hashArray.length-1; i++){
			if(hashArray[i] == word){
				return true;		
			}
		}
		return false;
	}
	
	
	public static String find(String word){
		return word;
		
	}
	
	public int size(){	
		return hashArray.length;
	}
	
}

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
		if(b<0) {
			b=Math.abs(b);
		}
		return b;
		
	}
	
	public void add(String o){
		int value = hashC(o);
		for(int i=0;i<hashArray.length;i++) {
			if(hashArray[value] == null) {
				hashArray[value] = o;
				hashArrInt[value] ++;
				break;
			}
			else if(o.compareTo(hashArray[value])==0) {
				hashArrInt[value] ++;
				break;
			}
			else {
				value = value+1;
			}
		}
		

	}
	public void print() {
		for(int i =0;i<hashArray.length;i++) {
			if(hashArray[i] !=null) {
				System.out.println(hashArray[i]+" "+hashArrInt[i]);
				
			}
			
		}
	}

	public boolean contains(String word){
		for(int i = 0; i < hashArray.length-1; i++){
			if(hashArray[i] == word){
				return true;		
			}
		}
		return false;		
	}
	
	public int totWords() {
		int tot = 0;
		
		//for(int i=0; )
		
		return tot;
	}
	
	public int find(String word){
		
		for(int i=0;i<hashArray.length;i++) {
			
			if(hashArray[i] != null) {
			
				if(word.compareTo(hashArray[i]) == 0){
				
					return i;
				}
			}
		}
		return -1;
	}
	
	public String getWord(int i){
		String ord = hashArray[i];
		return ord;
	}
	
	public int getInt(int i){
		int in = hashArrInt[i];
		return in;
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();	
		
		hej.add("hej");
		hej.add("rebecka");
		hej.add("ylv");
		hej.add("hej");
		System.out.println(hej.find("hej"));
		hej.print();
	}
}

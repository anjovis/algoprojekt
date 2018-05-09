
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
	
	public int size(){
	
		return hashArray.length;
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();	
		
		hej.add("hej",hashC("hej"));
		hej.add("rebecka",10);
		hej.add("ylv",10);
		hej.add("hej",hashC("hej"));
		
		hej.print();


	}
}

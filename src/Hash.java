
public class Hash {


	private String[] hashArray;
	private String key;
    private int value;
     
	
	public Hash() {
		hashArray =  new String[10];

	}
	
	public static int hashCode(String o) {
		
		int half = o.length()/2;
		int ascii =0;
		int ascii2 =0;
		String hashVal;

		int result;
		for(int i =0;i<half;i++) {
			ascii = ascii + o.charAt(i);	
		}
		for(int i =half;i<o.length();i++) {
			ascii2 = ascii2+o.charAt(i);	
			
		}
		hashVal = Integer.toString(ascii)+Integer.toString(ascii2);
		
		result = Integer.parseInt(hashVal);
		return result;
		
	}
	
	public static void main(String[] args) {
		Hash hej = new Hash();
		
		System.out.println(hashCode("hej"));
		System.out.println(hashCode("0"));
		
		
		
		
	}
	//
	public void add(String key, int value){

   
		
	}
	
	public int size(){
	
		return hashArray.length;
	}
	
	

}

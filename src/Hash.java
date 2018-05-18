public class Hash {


	private String[] hashArray;
	private int[] hashArrInt;
	private int size;

	public Hash() {
		hashArray =  new String[10007];
		hashArrInt = new int[10007];
		size = 0;
	}

	/**
	 * hashC tar in en string och gör om till en hashcode.
	 * @param String o
	 * @return int b
	 */
	public int hashC(String o) {		
		int a = o.hashCode();
		int b = a % hashArray.length;
		if(b<0) {
			b=Math.abs(b);
		}
		return b;

	}

	/**
	 * add tar in en string och addar stringen till hasharrayen pÂ den indexen som ordet fick av hashC
	 * om platsen är upptagen med ett annat ord hoppar den till nästa plats och addar där istället.
	 * @param String o
	 */
	public void add(String o){
		if(o != null){
			int value = hashC(o);
			for(int i=0;i<hashArray.length;i++) {
				if(hashArray[value] == null) {
					hashArray[value] = o;
					hashArrInt[value] ++;
					size++;
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
	}
	
	/**
	 * print skriver ut hasharrayen och dess innehÂll och hoppar över alla platser som är null.
	 */
	public void print() {
		for(int i =0;i<hashArray.length;i++) {
			if(hashArray[i] !=null) {
				System.out.println(hashArray[i]+" "+hashArrInt[i]);

			}

		}
	}

	/**
	 * find tar in en string och letar upp ordet på den indexplatsen och retunerar indexvärdet.
	 * @param String word
	 * @return int i
	 */
	public int find(String word){
		if(word == null){
			return -1;
		}		
		for(int i=0;i<hashArray.length;i++) {

			if(hashArray[i] != null) {

				if(word.compareTo(hashArray[i]) == 0){

					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * getWord tar in en int i (index) och letar upp ordet som ligger på den platsen och retunerar ordet.
	 * @param int i
	 * @return String ord
	 */
	public String getWord(int i){
		if(i < 0){
			return null;
		}
		String ord = hashArray[i];
		return ord;
	}

	/**
	 * getInt tar in en int i (index) och letar upp ordet som ligger på den platsen och retunerar frekvensen av ordet.
	 * @param int i
	 * @return int in
	 */
	public int getInt(int i){
		if(i < 0){
			return -1;
		}
		int in = hashArrInt[i];
		return in;
	}
	
	/**
	 * size läser av hur många platser som har ett ord i hasharrayen och retunerar så många platser som är upptagna.
	 * @return int size
	 */
	public int size(){	
		return size;
	}

}

import static org.junit.Assert.*;
import org.junit.Test;

	public class HashTest {
		Hash test = new Hash();
		 
		@Test
		public void hashCTest(){
			assertEquals("Check that the code is the same", 3111, test.hashC("hej"));	
		}
		
		@Test
		public void findTest(){
			test.add("hej");
			test.add(null);
			
			assertEquals("Check that the word dosent exist", -1, test.find("Moa"));	
			assertEquals("Check that the word exist", 3111, test.find("hej"));	
			assertEquals("Check that we dont find anything when we search for nothing", -1, test.find(""));
			assertEquals("Check that we dont find anything when we search for null", -1, test.find(null));
		}	
		
		@Test
		public void addTest(){
			for( int i =0 ; i<60 ; i++) {
				test.add("hej");
			}
			
			assertEquals("Check that the list has size 1", 1, test.size());
			assertEquals("Check that the list has 60 hej", 60, test.getInt(3111));
		}

		@Test
		public void sizeTest(){
			test.add("Hej");
			test.add("Hello");
			test.add("Hej");		
			assertEquals("Check that new list has size 2", 2, test.size());
		}
		@Test
		public void getIntTest(){
			test.add("hej");
			test.add("hej");			
			assertEquals("Check that the frequence is 2", 2, test.getInt(3111));
			assertEquals("Check that the frequence is 0", 0, test.getInt(3112));
			assertEquals("Check that the int doesnt exist", -1, test.getInt(-2));
		}
		@Test
		public void getWordTest(){
			test.add("hej");		
			assertEquals("Check that the code in string is hej", "hej", test.getWord(3111));
			assertEquals("Check that the code in string is null", null , test.getWord(-2));
			
		}
}



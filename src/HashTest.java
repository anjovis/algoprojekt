import static org.junit.Assert.*;
import org.junit.Test;

	public class HashTest {
		Hash test = new Hash();
		 
		@Test
		public void CodeTest(){
			assertEquals("Check that the code is the same", 3111, test.hashC("hej"));			
		}
		
		@Test
		public void findTest(){
			test.add("hej");
			
			assertEquals("Check that the word dosent exist", -1, test.find("Moa"));	
			assertEquals("Check that the word exist", 3111, test.find("hej"));	
			assertEquals("Check that we dont find anything when we search for nothing", -1, test.find(""));
		}		
		
		@Test
		public void containsAddTest(){
			test.add("Hej");
		
			assertEquals("Test contains() with existing object", true, test.contains("Hej"));
			assertEquals("Test contains() with non existing object", false, test.contains("Moa"));
			assertEquals("Test contains() with null object", false, test.contains(null));		
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
			assertEquals("Check that the code in string is hej", null , test.getWord(-2));
			
		}
}



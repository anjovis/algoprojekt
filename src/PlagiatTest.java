import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlagiatTest {
	Hash test = new Hash();	
	   
		@Test
		public void KeysTest(){
			test.hashC("Hej");
			assertEquals("Check that the code is the same", 3111, test.hashC("hej"));			
		}
		
		@Test
		public void CompareTest(){
			test.add("Hej");
			
		}
}
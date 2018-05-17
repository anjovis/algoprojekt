import static org.junit.Assert.*;

import org.junit.Test;

public class PlagiatTest extends Plagiat{
	
	@Test
	public void compareTest() {
		
		Hash test = new Hash();
		Hash test2 = new Hash();
		Hash test3 = new Hash();
		
		test.add("Rebecka");
		test.add("Anja");
		test.add("Moa");
		
		test2.add("Rebecka");
		test2.add("Moa");
		test2.add("Anja");
		
		test3.add("Rebecka");
		test3.add("Anja");
		test3.add("Spens");
		
		assertEquals("Test if compare returns 100% when two hash is equal",100.0, 0.0,compareFile(test,test2));
		assertEquals("Test if compare returns 75% when two hash has 2/3 equal",75.0,0.0,compareFile(test,test3));
	}

}

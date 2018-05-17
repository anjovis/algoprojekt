import static org.junit.Assert.*;

import org.junit.Test;

public class PlagiatTest {

	@Test
	public void compareFileTest() {
		Hash test = new Hash();
		Hash test2 = new Hash();
		test.add("Rebecka");
		test2.add("Rebecka");
		
		assertEquals("sddcsd",100, compareFile(test,test2));
	}

}

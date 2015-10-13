import java.io.FileNotFoundException;
import junit.framework.TestCase;
/**
 * @author Richard A Roman
 *
 */
public class PetStoreTest extends TestCase {
	/**
	 * Test method for {@link PetStore#PetStore()}.
	 * @throws FileNotFoundException 
	 */
	public void testPetStore() throws FileNotFoundException {
		//1. set expected value
		String expected = "Peart";
		
		//2. obtain a PetStore object
		PetStore petStore = new PetStore();
		
		//3. get the actual value
		String actual = petStore.();
		
		//4. compare to test the method
		if(expected.equals(actual)){
			System.out.println("Passed");
		}
		else{
			System.out.println("failed");
		}
		
		System.out.println("Expected is: "+expected);
		System.out.println("Actual is: "+actual);
		
		//assertEquals(expected, actual);
		
		//fail("Not yet implemented");
	}
}
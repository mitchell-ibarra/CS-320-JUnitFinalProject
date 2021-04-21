/**
 * 
 */
package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestAllergey {
	// Creating empty Allergey object
	private Allergey allergey;

	/**
	 * Instantiate allergey object 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.allergey = new Allergey("Aspirin");
	}

	/**
	 * Test the instantiation of the object with the allergy name
	 */
	@Test
	public void testConstructor() {
		assertEquals("Aspirin", allergey.getName(), "getName did not return expected String name for Allergey class.");
	}
	
	/**
	 * Test the setName method of Allergey object
	 */
	@Test
	public void testSetName()
	{
		String expectedValue = "Ibuprofen";
		allergey.setName(expectedValue);
		assertEquals("Ibuprofen", allergey.getName(), "setName and getName did not properly set and retrieve the name for Allergey class");
	}
	
	/**
	 * Test the setName method of Allergey object
	 * This test should fail, but method does not check for a valid name entry
	 */
	@Test
	public void testSetBadName()
	{
		String expectedValue = "65132asd";
		allergey.setName(expectedValue);
		assertEquals("65132asd", allergey.getName(), "setName and getName did not properly set and retrieve the name for Allergey class");
	}
	
	/**
	 * Test the toString method of Allergey object
	 */
	@Test
	public void testToString()
	{
		String expectedValue = "Allergy Aspirin";
		assertEquals(expectedValue, allergey.toString(), "toString did not properly return the expected String for Allergey class.");
	}
}

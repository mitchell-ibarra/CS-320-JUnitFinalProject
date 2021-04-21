package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestDoctor {

	//Create empty Doctor object
	Doctor doctor;
	
	/**
	 * Instantiate Doctor object before very test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.doctor = new Doctor("Mitchell", "1234");
	}

	/**
	 * Test the set Name for Doctor
	 */
	@Test
	public void testSetName() {
		String expectedValue = "Matt";
		doctor.setName(expectedValue);
		assertEquals("Matt", doctor.getName(), "setName and getName did not set and return expected name for Doctor class.");
	}
	
	/**
	 * Test the setName method of Doctor object
	 * This test should fail, but method does not check for a valid name entry
	 */
	@Test
	public void testSetBadName()
	{
		String expectedValue = "65132asd";
		doctor.setName(expectedValue);
		assertEquals("65132asd", doctor.getName(), "setName and getName did not properly set and retrieve the name for Allergey class");
	}
	
	/**
	 * Test the set ID method for Doctor
	 */
	@Test
	public void testSetID()
	{
		String expectedValue = "1010";
		doctor.setId(expectedValue);
		assertEquals("1010", doctor.getId(), "set ID and getID did not set return the expected ID for the Doctor class.");
	}
	
	/**
	 * Test the set ID method for Doctor
	 * This test should fail, but the method does not check for a valid ID entry
	 */
	@Test
	public void testSetBadID()
	{
		String expectedValue = "asdasd";
		doctor.setId(expectedValue);
		assertEquals("asdasd", doctor.getId(), "set ID and getID did not set return the expected ID for the Doctor class.");
	}
	
	/**
	 * Test the Doctor's toString method
	 */
	@Test
	public void testToString()
	{
		String expectedValue = "Doctor Name: Mitchell ID: 1234";
		assertEquals(expectedValue, doctor.toString(), "toString did not return the expected String for the Doctor class.");
	}

}

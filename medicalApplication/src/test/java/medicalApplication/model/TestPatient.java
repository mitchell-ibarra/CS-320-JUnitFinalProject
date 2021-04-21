/**
 * 
 */
package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Patient;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 */
public class TestPatient {
	//Create empty Patient object
	Patient patient;

	/**
	 * Instantiate patient object
	 */
	@Before
	public void setUp() throws Exception {
		this.patient = new Patient("Morty", "1111");
	}

	/**
	 * Test set name method for Patient class
	 */
	@Test
	public void testSetName() {
		String expectedValue = "Mike";
		patient.setName(expectedValue);
		assertEquals(expectedValue, patient.getName());
	}
	
	/**
	 * Test set name method for Patient class
	 * This test should fail but the method does not check for a valid name entry
	 */
	@Test
	public void testSetBadName() {
		String expectedValue = "987asd";
		patient.setName(expectedValue);
		assertEquals(expectedValue, patient.getName());
	}

	/**
	 * Test set ID method for patient class
	 */
	@Test
	public void testSetID()
	{
		String expectedValue = "1000";
		patient.setId(expectedValue);
		assertEquals(expectedValue, patient.getId());
	}
	
	/**
	 * Test set ID method for patient class
	 * This test should fail but the method does not check for a valid ID entry
	 */
	@Test
	public void testSetBadID()
	{
		String expectedValue = "asdasd987";
		patient.setId(expectedValue);
		assertEquals(expectedValue, patient.getId());
	}
	
	/**
	 * Test toString method for Patient class
	 */
	@Test
	public void testToString()
	{
		String expectedValue = "Patient Name: Morty ID: 1111";
		assertEquals(expectedValue, patient.toString());
	}
}

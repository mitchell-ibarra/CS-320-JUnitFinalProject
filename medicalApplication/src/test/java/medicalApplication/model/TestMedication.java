/**
 * 
 */
package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Medication;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestMedication {
	//Create empty Medication object
	Medication medication;
	
	/**
	 * Instantiate Medication object
	 */
	@Before
	public void setUp() throws Exception {
		this.medication = new Medication("Ibuprofen", "9.27.2020", "9.30.2020", "As needed");
	}

	/**
	 * Test the setName method for Medication class
	 */
	@Test
	public void testSetName() {
		String expectedValue = "Acetaminophen";
		medication.setName(expectedValue);
		assertEquals(expectedValue, medication.getName());
	}
	
	/**
	 * Test the setName method for Medication class
	 * This test should fail, but setName does not check for invalid name entry
	 */
	@Test
	public void testSetBadName() {
		String expectedValue = "asd654";
		medication.setName(expectedValue);
		assertEquals(expectedValue, medication.getName());
	}
	
	/**
	 * Test the setStartDate method of Medication class
	 */
	@Test
	public void testSetStartDate()
	{
		String expectedValue = "8.31.2020";
		medication.setStartDate(expectedValue);
		assertEquals(expectedValue, medication.getStartDate());
	}
	
	/**
	 * Test the setEndDate method of Medication class
	 */
	@Test
	public void testSetEndDate()
	{
		String expectedValue = "10.12.2020";
		medication.setEndDate(expectedValue);
		assertEquals(expectedValue, medication.getEndDate());
	}
	
	/**
	 * Test the setDose method of Medication class
	 */
	@Test
	public void testSetDose()
	{
		String expectedValue = "Twice a day";
		medication.setDose(expectedValue);
		assertEquals(expectedValue, medication.getDose());
	}
	/**
	 * Test the toString method of Medication class
	 */
	@Test
	public void testToString()
	{
		String expectedValue = "Medication:Ibuprofen Start Date: 9.27.2020 End Date: 9.30.2020 Dose: As needed";
		assertEquals(expectedValue, medication.toString());
	}
}

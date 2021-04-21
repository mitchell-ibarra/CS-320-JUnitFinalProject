/**
 * 
 */
package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Treatment;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestTreatment {
	//Create empty treatment object
	Treatment treatment;
	
	/**
	 * Instantiate Treatment object before every test
	 */
	@Before
	public void setUp() throws Exception {
		this.treatment = new Treatment("9.27.2020", "Flu", "High fever with sneezing and coughing.");
	}

	/**
	 * Test setTreatmentDate method for Treatment object
	 */
	@Test
	public void testSetDate() {
		String expectedValue = "9.20.2020";
		treatment.setTreatmentDate(expectedValue);
		assertEquals(expectedValue, treatment.getTreatmentDate(), "setTreatementDate did not properly set date for Treatment object.");
	}

	/**
	 * Test setDiagnose method for Treatment object
	 */
	@Test
	public void testSetDiagnose()
	{
		String expectedValue = "Chicken Pox";
		treatment.setDiagnose(expectedValue);
		assertEquals(expectedValue, treatment.getDiagnose(), "setDiagnose did not properly set diagnose for Treatment object.");
	}
	
	/**
	 * Test setDescription method for treatment object
	 */
	@Test
	public void testSetDescription()
	{
		String expectedValue = "Red itchy hives covering body";
		treatment.setDescription(expectedValue);
		assertEquals(expectedValue, treatment.getDescription(), "setDescription did not properly set description for Treatment object.");
	}
	
	/**
	 * Test the toString method for the Treatment class
	 */
	@Test
	public void testToString()
	{
		String expectedValue = "Treatment: Bed rest and fluids Date: 9.27.2020 Diagnose: Flu";
		assertEquals(expectedValue, treatment.toString(), "testToString did not return expected String value. Missing treatment variable.");
	}
}

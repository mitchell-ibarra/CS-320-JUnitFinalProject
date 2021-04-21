/**
 * 
 */
package medicalApplication.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.services.DoctorService;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestDoctorService { 

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		DoctorService.getReference().addDoctor("Matt", "456");
	}

	/**
	 * Test addDoctor method and try to add duplicate doctor to instance
	 */
	@Test
	public void testAddDoctorFalse() {
		Boolean addDoctor = DoctorService.getReference().addDoctor("Matt", "456");
		Boolean expectedAnswer = false;
		assertEquals("addDoctor should not be able to add doctor with duplicate ID", expectedAnswer, addDoctor);
	}
	
	/**
	 * Test addDoctor method and try to add new doctor
	 */
	@Test
	public void testAddDoctorTrue()
	{
		Boolean addDoctor = DoctorService.getReference().addDoctor("Mitchell", "1231");
		Boolean expectedAnswer = true;
		assertEquals("addDoctor should not be able to add doctor with duplicate ID", expectedAnswer, addDoctor);
	}
}

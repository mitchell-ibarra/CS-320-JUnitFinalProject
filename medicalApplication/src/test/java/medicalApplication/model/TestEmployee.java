package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Employee;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestEmployee {
	//Create empty Employee object
	Employee employee;

	/**
	 * Instantiate Employee object before every test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.employee = new Employee("Matt", "1000");
	}

	/**
	 * Test retrieval of employee name
	 */
	@Test
	public void testGetName() {
		String expectedValue = "Matt";
		assertEquals(expectedValue, employee.getName(), "getName did not returnn the expected name.");
	}

	/**
	 * Test retrieval of employee ID
	 */
	@Test
	public void testGetID()
	{
		String expectedValue = "1000";
		assertEquals(expectedValue, employee.getId(), "getID did not return the expected ID.");
	}
	
	/**
	 * Test retrieval of employee password
	 */
	@Test
	public void getPassword()
	{
		String expectedValue = "Open";
		assertEquals(expectedValue, employee.getPassword(), "getPassword did not return the expected password.");
	}
}

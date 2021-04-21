/**
 * 
 */
package medicalApplication.model;

/**
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.PatientHistory;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestMedicalRecord {
	//Creating empty MedicalRecord object
	MedicalRecord medicalRecord;
	//Creating empty Patient object
	Patient patient;
	//Creating empty PatientHistory object
	PatientHistory history;

	/**
	 * Instantiating medical record object
	 */
	@Before
	public void setUp() throws Exception {
		patient = new Patient("Mark", "1321");
		medicalRecord = new MedicalRecord(patient);
	}

	/**
	 * Testing getPatient method of MedicalRecord class
	 */
	@Test
	public void testGetPatient() {
		Patient expectedPatient = medicalRecord.getPatient();
		assertEquals(patient.toString(), expectedPatient.toString());
	}
	
	/**
	 * Testing getHistory method of MedicalRecord class
	 */
	@Test
	public void testGetHistory()
	{
		PatientHistory expectedPatientHistory = medicalRecord.getHistory();
		assertNotNull(expectedPatientHistory);
	}

}

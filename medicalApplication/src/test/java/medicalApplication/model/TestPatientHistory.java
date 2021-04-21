/**
 * 
 */
package medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.PatientHistory;
import medical.com.medicalApplication.model.Treatment;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestPatientHistory {
	//Create empty PatientHistory object
	PatientHistory patientHistory;

	/**
	 * Instantiate patientHistory object
	 */
	@Before
	public void setUp() throws Exception {
		patientHistory = new PatientHistory();
	}

	/**
	 * Testing the addTreatment method of PatientHistory
	 */
	@Test
	public void testAddTreatment() {
		Treatment expectedTreatment = new Treatment("9.27.2020", "Flu", "Fever");
		patientHistory.addTreatment(expectedTreatment);
		Treatment treatment = patientHistory.getAllTreatments().get(0);
		assertEquals(expectedTreatment.toString(), treatment.toString(), "PatientHistory did not correctly add Treatment to list of treatments.");
	}
	
	/**
	 * Testing the addAllergy method of PatientHistory
	 */
	@Test
	public void testAddAllergy()
	{
		Allergey expectedAllergy = new Allergey("Ibuprofen");
		patientHistory.addAllergy(expectedAllergy);
		Allergey allergy = patientHistory.getAlergies().get(0);
		assertEquals(expectedAllergy.toString(), allergy.toString(), "PatientHistory did not correctly add Allergy to list of allergies");
	}
	
	/**
	 * Testing the addMedication method of PatientHistory
	 */
	@Test
	public void testAddMedication()
	{
		Medication expectedMedication = new Medication("Aspirin", "9.27.2020", "9.30.2020", "As needed");
		patientHistory.addMedication(expectedMedication);
		Medication medication = patientHistory.getAllMedications().get(0);
		assertEquals(expectedMedication.toString(), medication.toString(), "PatientHistory did not correctly add Medication to list of medications");
	}

}

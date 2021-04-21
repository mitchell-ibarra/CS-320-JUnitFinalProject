package medicalApplication.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.services.MedicalRescordService;

/**
 * @author Mitchell Ibarra
 * Southern New Hampshire University 
 * CS 320 Milestone One
 * 9/27/20
 *
 */
public class TestMedicalRecordService {

	@Before
	public void setUp() throws Exception {
		MedicalRescordService.getReference().addPatient("Matt", "1234");
	}

	/**
	 * Testing addPatient with duplicate patient and ID
	 */
	@Test
	public void testAddDuplicatePatient() {
		Boolean addPatient = MedicalRescordService.getReference().addPatient("Matt", "1234");
		Boolean expectedAnswer = false;
		assertEquals("Test failed, should not be able to add duplicate patient ID with name.", addPatient, expectedAnswer);
	}
	
	/**
	 * Testing addPatient with new patient
	 */
	@Test
	public void testAddNewPatient()
	{
		Boolean addPatient = MedicalRescordService.getReference().addPatient("Marty", "1111");
		Boolean expectedAnswer = true;
		assertEquals("Test failed, should be able to add new patient.", addPatient, expectedAnswer);
	}

	/**
	 * Testing getMedicalRecord method in MedicalRecordService to get patient name
	 */
	@Test
	public void testGetMedicalRecordPatientName()
	{
		MedicalRecord medicalRecord = MedicalRescordService.getReference().getMedicalRecord("1234");
		assertEquals(medicalRecord.getPatient().getName(), "Matt");
	}
	
	/**
	 * Testing getMedicalRecord method in MedicalRecordService for patient ID
	 */
	@Test
	public void testGetMedicalRecordPatientID()
	{
		MedicalRecord medicalRecord = MedicalRescordService.getReference().getMedicalRecord("1234");
		assertEquals(medicalRecord.getPatient().getId(), "1234");
	}
	
	/**
	 * Testing getPatient method in MedicalRecordService
	 */
	@Test
	public void testGetPatient()
	{
		Patient patient = MedicalRescordService.getReference().getPatient("1234");
		assertEquals(patient.getName(), "Matt");
	}
	
	/**
	 * Testing getPatient method in MedicalRecordService with a new patient
	 */
	@Test
	public void testGetNewPatient()
	{
		MedicalRescordService.getReference().addPatient("Marc", "4564");
		Patient patient = MedicalRescordService.getReference().getPatient("4564");
		assertEquals(patient.getName(), "Marc");
	}
	
	/**
	 * Testing GetPatientWithAllergies method in MedicalRecordService 
	 */
	@Test
	public void testGetPatientWithAllergies()
	{
		List<Patient> list = MedicalRescordService.getReference().getPatientsWithAllergies("Ibuprofen");
		assertTrue(list.isEmpty());
		//list should be empty, this test fails.
	} 
}

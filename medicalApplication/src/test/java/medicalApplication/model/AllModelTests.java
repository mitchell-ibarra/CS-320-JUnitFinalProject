package medicalApplication.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAllergey.class, TestDoctor.class, TestEmployee.class, TestMedicalRecord.class, TestMedication.class,
		TestPatient.class, TestPatientHistory.class, TestTreatment.class })
public class AllModelTests {

}

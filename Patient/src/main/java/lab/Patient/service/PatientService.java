package lab.Patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.Patient.model.Patient;
import lab.Patient.reposistory.PatientReposistory;

@Service
public class PatientService {
	@Autowired
	PatientReposistory paRepo;
	Patient[] arr = new Patient[3];
	int i = 0;

	// create
	public Patient addPatient(Patient p) {
		// [i] = p;
		// i++;
		// return p;
		return paRepo.save(p);
	}

	// read
	public Iterable<Patient> getPatient() {
		// return arr;
		return paRepo.findAll();

	}

	// update
	public void updatePatient(Integer id, Patient p) {
		/*
		 * for (int j = 0; j < arr.length; j++) { if (arr[j].getId().equals(id)) {
		 * arr[j] = p; } }
		 */
		Patient old = paRepo.findById(id).get();
		old.setDoctor(p.getDoctor());
		old.setInsurance(p.getInsurance());
		paRepo.save(p);
	}

	// delete
	public void deletePatient(Integer id) {
		/*
		 * for (int j = 0; j < arr.length; j++) { if (arr[j].getId().equals(id)) {
		 * arr[j] = null; } }
		 */
		paRepo.deleteById(id);
	}
}
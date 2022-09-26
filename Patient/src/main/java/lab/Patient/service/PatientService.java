package lab.Patient.service;

import lab.Patient.model.Patient;

public class PatientService {
	Patient[] arr = new Patient[3];
	int i = 0;

	// create
	public Patient addPatient(Patient p) {
		arr[i] = p;
		i++;
		return p;
	}

	// read
	public Patient[] getPatient() {
		return arr;

	}

	// update
	public void updatePatient(Integer id, Patient p) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j].getId().equals(id)) {
				arr[j] = p;
			}
		}
	}

	// delete
	public void deletePatient(Integer id) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j].getId().equals(id)) {
				arr[j] = null;
			}
		}
	}
}
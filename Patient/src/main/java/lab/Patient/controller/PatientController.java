package lab.Patient.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lab.Patient.model.Patient;
import lab.Patient.service.PatientService;

@RestController
public class PatientController {
	PatientService service = new PatientService();

	@PostMapping("api/v1/patient")
	public Patient addPatient(@RequestBody Patient p) {
		return service.addPatient(p);

	}

	@GetMapping("api/v1/patient")
	public Patient[] getPatient() {
		return service.getPatient();
	}

	@PatchMapping("api/v1/patient/{id}")
	public void updatePatient(@PathVariable("id") Integer id, @RequestBody Patient p) {
		service.updatePatient(id, p);

	}

	@DeleteMapping("api/v1/patient/{id}")
	public void deletePatient(@PathVariable("id") Integer id) {
		service.deletePatient(id);
	}

}

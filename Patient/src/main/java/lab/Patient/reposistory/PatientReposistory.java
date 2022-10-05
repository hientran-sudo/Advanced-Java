package lab.Patient.reposistory;

import org.springframework.data.repository.CrudRepository;
import lab.Patient.model.Patient;

public interface PatientReposistory extends CrudRepository<Patient, Integer>{

}

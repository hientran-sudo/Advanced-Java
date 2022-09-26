package lab.Patient.model;

public class Patient {
	String name;
	Integer id;
	String doctor, insurance;

	public Patient(String name, Integer id, String doctor, String insurance) {
		this.name = name;
		this.id = id;
		this.doctor = doctor;
		this.insurance = insurance;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

}

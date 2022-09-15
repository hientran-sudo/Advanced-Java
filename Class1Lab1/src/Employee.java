public class Employee {
	protected int id;
	protected String name;
	protected double rate;
	protected double hours;

	public Employee(int id, String name, double rate, double hours) {
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double wage() {
		return rate*hours;
	}
	
	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nWage: " + wage(); 
	}

}

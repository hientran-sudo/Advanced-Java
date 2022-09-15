
public class FullTime extends Employee {
	private double bonus;

	public FullTime(int id, String name, double rate, double hours, double bonus) {
		super(id, name, rate, hours);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double wageoffulltime() {
		return super.wage() + bonus;
	}

	public String toString() {
		return "ID: " + id + "\nName: " + name + "\nWage: " + wageoffulltime();
	}
}

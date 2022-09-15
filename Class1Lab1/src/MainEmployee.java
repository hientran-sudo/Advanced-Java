
public class MainEmployee {

	public static void main(String[] args) {
		Employee[] em = new Employee[2];
		em[0] = new Employee(01, "Liz", 20.0, 40);
		em[1] = new FullTime(02, "Zac", 25.0, 40,1000.0);

		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i].toString());
		}

	}

}

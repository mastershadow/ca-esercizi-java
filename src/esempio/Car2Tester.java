package esempio;

public class Car2Tester {

	public static void main(String[] args) {
		Car2 ibiza = new Car2(20);
		ibiza.addGas(20);
		try {
			ibiza.drive(1000);
		} catch (Exception e) {
			System.out.println("Ho finito la benzina");
		}
		System.out.println(ibiza.getGas());

	}

}

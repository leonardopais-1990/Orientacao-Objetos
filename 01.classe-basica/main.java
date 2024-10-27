package Exe3;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new Car("Blue", "Ka", 6);
		c1.Print();
		
		Car c2 = new Car("Black", "Citroen", 4, true);
		c2.Print();
		
		Car c3 = new Car("Purple", "Fiat 147", 4, true, true, true);
		c3.Print();

	}
}

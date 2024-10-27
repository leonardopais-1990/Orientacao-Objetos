package ex4;

public class Main {

	public static void main(String[] args) {
		Date D1 = new Date();
		D1.ShowDate();
		
		Date D2 = new Date(16, 3, 2024);
		D2.ShowDate(3);
		
		Date D3 = new Date(30, 0, 2024);
		D3.ShowDate(0);
		
		Date D4 = new Date(31, 12, 2024);
		D4.NextDate();
		D4.ShowDate();
	}
}

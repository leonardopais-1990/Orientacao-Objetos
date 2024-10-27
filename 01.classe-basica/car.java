package Exe3;

public class Car {
	private int door;
	private String color, model, type;
	private boolean x44, seat, air;
	
	public Car(String color, String model, int door){
		this.type = "Casual";
		this.color = color;
		this.model = model;
		this.door = door;
		this.x44 = false;
		this.seat = false;
		this.air = false;
	}
	
	public Car(String color, String model, int door, boolean x44){
		this.type = "Sport";
		this.color = color;
		this.model = model;
		this.door = door;
		this.x44 = true;
		this.seat = false;
		this.air = false;
	}
	
	public Car(String color, String model, int door, boolean x44, boolean seat, boolean air){
		this.type = "Luxury";
		this.color = color;
		this.model = model;
		this.door = door;
		this.x44 = true;
		this.seat = true;
		this.air = true;
	}	
	
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public boolean isX44() {
		return x44;
	}
	public void setX44(boolean x44) {
		this.x44 = x44;
	}

	public boolean isSeat() {
		return seat;
	}
	public void setSeat(boolean seat) {
		this.seat = seat;
	}

	public boolean isAir() {
		return air;
	}
	public void setAir(boolean air) {
		this.air = air;
	}

	public void Print() {
		System.out.println("Type: " + this.type);
		System.out.println("Color: " + this.color);
		System.out.println("Model: " + this.model);
		System.out.println("Door: " + this.door);
		System.out.println("4x4: " + this.x44);
		System.out.println("Air: " + this.air);
		System.out.println("Seat: " + this.seat);
		System.out.println("-------------------------");
		
	}
}

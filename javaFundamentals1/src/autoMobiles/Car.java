package autoMobiles;

public class Car {
	
	public int seats;
	public int wheels;
	public String carName;
	private boolean keyStatus;
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public boolean isKeyStatus() {
		return keyStatus;
	}
	public void setKeyStatus(boolean keyStatus) {
		this.keyStatus = keyStatus;
	}

}

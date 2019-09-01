package tws.entity;

import java.io.Serializable;

public class ParkingLot implements Serializable {
    private int parkingLotID;
    private int  capacity;
    private int  availablePositionCount;
	public int getParkingLotID() {
		return parkingLotID;
	}
	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public ParkingLot(int parkingLotID, int capacity, int availablePositionCount) {
		super();
		this.parkingLotID = parkingLotID;
		this.capacity = capacity;
		this.availablePositionCount = availablePositionCount;
	}
	public ParkingLot() {
		
	}
	

    
}

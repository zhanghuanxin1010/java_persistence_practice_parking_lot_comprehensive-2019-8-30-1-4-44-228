package tws.entity;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParkingLotDTO implements Serializable {

	ParkingLot parkingLot=new ParkingLot();
	List<ParkingLot>parkingLotLists=new ArrayList<ParkingLot>();
	public ParkingLotDTO(ParkingLot parkingLot, List<ParkingLot> parkingLotList) {
		super();
		this.parkingLot = parkingLot;
		this.parkingLotLists = parkingLotList;
	}
	public ParkingLotDTO(ParkingLot parkingLot ) {
		this.parkingLot = parkingLot;
	
		
	}
	public ParkingLotDTO( ) {
		
	
		
	}
	public ParkingLot getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	public List<ParkingLot> getParkingLotList() {
		return parkingLotLists;
	}
	public void setParkingLotList(ParkingLot parkingLotList) {
		parkingLotLists.add(parkingLotList);
		//this.parkingLotList = parkingLotList;
	}
	
	

    
}

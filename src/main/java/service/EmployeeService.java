package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tws.entity.ParkingLot;
import tws.entity.ParkingLotDTO;
import tws.repository.EmployeeMapper;

public class EmployeeService {
	List<ParkingLot> parkingLotList=new ArrayList<ParkingLot>();
	
	public List<ParkingLot> selectParkingLot() {
		// TODO Auto-generated method stub
		return parkingLotList;	
		
	    }
	public void  addParkingLot(ParkingLot parkingLot,ParkingLotDTO parkingLotDTO) {
		// TODO Auto-generated method stub
		//ParkingLotDTO parkingLotDTO=new ParkingLotDTO();
		
		parkingLotDTO.setParkingLotList(parkingLot);
		//parkingLotList.add(parkingLot);
		
	    }

	
}

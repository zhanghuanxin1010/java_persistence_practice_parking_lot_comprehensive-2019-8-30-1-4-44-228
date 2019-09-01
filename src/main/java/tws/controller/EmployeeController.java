package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.EmployeeService;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.entity.ParkingLotDTO;
import tws.repository.EmployeeMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeMapper.selectAll());
    }
    @PostMapping("")
    public ResponseEntity<Employee> insert(@RequestBody Employee employee) {
        employeeMapper.insert(employee);
        return ResponseEntity.created(URI.create("/employees/" + employee.getId())).body(employee);
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<ParkingLot>> getParkingLot() {
    	EmployeeService employeeService=new EmployeeService();
    	List<ParkingLot>parkingLotList= employeeService.selectParkingLot();  	
    	return ResponseEntity.ok(parkingLotList);
    }
    @PostMapping("/{id}")
    public void insertParkingLot(@RequestBody ParkingLot parkingLot,@RequestBody ParkingLotDTO parkingLotDTO) {
    	EmployeeService employeeService=new EmployeeService();
    	employeeService.addParkingLot(parkingLot,parkingLotDTO);
    	
    }
}

package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.test.web.servlet.ResultActions;

import service.EmployeeService;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.entity.ParkingLotDTO;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "employee");
    }
    @Test
    public void shouldFetchAllEmployees() {
        // given
        jdbcTemplate.execute("INSERT INTO EMPLOYEE VALUES(1,'zhangsan', 21);");
        // when
        List<Employee> employeeList = employeeMapper.selectAll();
        // then
        assertEquals(1, employeeList.size());
    }
    @Test
    public void shouldFetchInsertEmployees() {
        // given
    	Employee employee=new Employee(2,"lisi", "21");
        // when
    	 employeeMapper.insert(employee);
    	 List<Employee> employeeList = employeeMapper.selectAll();
        // then   
    	 assertEquals(1, employeeList.size());         
    }
    @Test
    public void shouldFetchInsertParking() {
        // given
    	ParkingLot parkingLot=new ParkingLot(3, 50,10);   	
    	EmployeeService employeeService=new EmployeeService();
    	ParkingLotDTO parkingLotDTO=new ParkingLotDTO();
        // when
    	employeeService.addParkingLot(parkingLot,parkingLotDTO);     	
        // then   
    	 assertEquals(1, parkingLotDTO.getParkingLotList().size());         
    }
}

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

import tws.entity.Employee;
import tws.entity.ParkingLot;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingLotMapperTest {

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "parkingLot");
    }
    @Test
    public void shouldFetchAllEmployees() {
        // given
        jdbcTemplate.execute("INSERT INTO PARKINGLOT VALUES(1, 20,10);");
        // when
        List<ParkingLot> parkingLotList = parkingLotMapper.selectAll();
        // then
        assertEquals(1, parkingLotList.size());
    }
    @Test
    public void shouldFetchInsertEmployees() {
        // given
    	ParkingLot parkingLot=new ParkingLot(2, 21,10);
        // when
    	parkingLotMapper.insert(parkingLot);
    	 List<ParkingLot> parkingLotList = parkingLotMapper.selectAll();
        // then   
    	 assertEquals(1, parkingLotList.size());
               
    }
}

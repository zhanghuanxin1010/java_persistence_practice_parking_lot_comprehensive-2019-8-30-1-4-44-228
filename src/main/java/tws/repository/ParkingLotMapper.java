package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;
import java.util.List;
import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {
    List<ParkingLot> selectAll();
  void insert(@Param("parkingLot") ParkingLot parkingLot);
void countAvailablePosition();
  
}

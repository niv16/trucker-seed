package academy.ennate.Service;


import academy.ennate.entity.Vehicle;
import java.util.List;

public interface VehicleService {


    List<Vehicle> findAll();
    Vehicle findOne(String vin);
    List<Vehicle> create(List<Vehicle> v);


}

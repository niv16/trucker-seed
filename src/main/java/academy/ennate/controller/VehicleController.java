package academy.ennate.controller;

import academy.ennate.Service.VehicleService;
import academy.ennate.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> findAll()
    {
        return vehicleService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value="{id}")
    public Vehicle findOne(@PathVariable("id") String id)
    {
        return vehicleService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public List<Vehicle> create(@RequestBody List<Vehicle> vehicle)
    {
        return  vehicleService.create(vehicle);
    }


}

package academy.ennate.Service;


import academy.ennate.Exception.VehicleNotFoundException;
import academy.ennate.Repository.VehicleRepository;
import academy.ennate.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImp implements VehicleService{

    @Autowired
    private VehicleRepository repo;

    @Transactional
    public List<Vehicle> findAll(){return (List<Vehicle>) repo.findAll();}


    @Transactional
    public Vehicle findOne(String id) {
        Optional<Vehicle> v = repo.findById(id);
        if(!v.isPresent())      {
            throw new VehicleNotFoundException("Vehicle with id= "+id+" not found");
        }
        return v.get();

    }

    @Transactional
    public List<Vehicle> create(List<Vehicle> v) {

        for (int i = 0; i <v.size() ; i++) {
            repo.save(v.get(i));
        }
        return v;
    }




}



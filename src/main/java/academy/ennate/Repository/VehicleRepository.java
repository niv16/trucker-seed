package academy.ennate.Repository;

import academy.ennate.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String>
{


}

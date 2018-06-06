package academy.ennate.Repository;

import academy.ennate.entity.Tire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TireRepository extends CrudRepository <Tire,String>{


}

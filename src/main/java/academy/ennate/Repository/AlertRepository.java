package academy.ennate.Repository;

import academy.ennate.entity.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertRepository extends CrudRepository<Alert,String> {



}

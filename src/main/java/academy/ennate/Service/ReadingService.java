package academy.ennate.Service;

import academy.ennate.entity.Alert;
import academy.ennate.entity.Reading;
import academy.ennate.entity.Tire;

import java.util.List;

public interface ReadingService {


    Reading create(Reading reading);
    Reading getReading(String vin);
    Alert createAlert(Reading reading);




}

package academy.ennate.Exception;

import academy.ennate.entity.Reading;

public class ReadingNotFoundException extends RuntimeException{

    public ReadingNotFoundException(String message)
    {
        super(message);
    }


}

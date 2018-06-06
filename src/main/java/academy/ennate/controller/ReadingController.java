package academy.ennate.controller;


import academy.ennate.Service.ReadingService;
import academy.ennate.entity.Reading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/readings")
public class ReadingController {

    @Autowired
    private ReadingService readingService;



    @RequestMapping(method=RequestMethod.GET, value="{vin}")
    public Reading getReading(@PathVariable("vin") String id)
    {return readingService.getReading(id);}


    @RequestMapping(method = RequestMethod.POST)
    public Reading create(@RequestBody Reading reading)
    {
        return  readingService.create(reading);
    }

}

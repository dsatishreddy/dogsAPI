package com.example.dogsApi;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DogApiController {
	
	@Autowired
    private DogApiService dogApiService;

    @GetMapping("/breeds")
    public void getWeather() throws IOException {
         dogApiService.getdogs();
    }

    
    @GetMapping("/breeds/{id}")
    public Dog getSpecificDog(@PathVariable("id") String breedId) throws IOException {
        return dogApiService.getspecificDog(breedId);
    }
    
    @GetMapping("/images/{id}")
    public void getImage(@PathVariable("id") String subID) throws IOException
    {
    	dogApiService.getDogWithImage(subID);
    }
}

package erg.rhund.Greeter.controller;

import erg.rhund.Greeter.GreetingService;
import erg.rhund.Greeter.models.Greeting;
import erg.rhund.Greeter.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private GreetingService service;

    @GetMapping("/all")
    public Collection<Greeting> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Greeting findGreetingById(@PathVariable Long id){
        return service.findById(id);
    }

}

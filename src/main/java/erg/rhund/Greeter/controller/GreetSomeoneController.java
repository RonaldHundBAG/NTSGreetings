package erg.rhund.Greeter.controller;

import erg.rhund.Greeter.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetsomeone")
public class GreetSomeoneController {

    @Autowired
    private GreetingService service;

    @GetMapping("/{id}")
    public String greetSomeone(@PathVariable Long id){
        return service.greetById(id);
    }
}

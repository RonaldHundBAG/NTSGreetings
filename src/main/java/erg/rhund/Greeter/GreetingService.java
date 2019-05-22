package erg.rhund.Greeter;

import erg.rhund.Greeter.models.Greeting;
import erg.rhund.Greeter.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository repository;

    public Collection<Greeting> findAll(){
        return repository.findAll();
    }

    public Greeting findById(Long id){
        return repository.findById(id).get();
    }

    public String greetById(Long id){
       Greeting greeting = repository.findById(id).get();
       String result = "Hallo "+greeting.getSatz()+ " mein " +greeting.getRole() +"!";
       return result;
    }
}

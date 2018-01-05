package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.say_Greeting();
    }

}

package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingService;
import georgemylonas.didemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.say_Greeting();
    }
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

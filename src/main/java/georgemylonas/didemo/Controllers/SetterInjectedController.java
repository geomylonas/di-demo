package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingService;
import georgemylonas.didemo.Services.GreetingServiceImpl;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.say_Greeting();
    }
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

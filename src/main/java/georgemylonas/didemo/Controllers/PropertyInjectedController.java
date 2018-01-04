package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.say_Greeting();
    }


}

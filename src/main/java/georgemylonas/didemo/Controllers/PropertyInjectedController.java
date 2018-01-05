package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.say_Greeting();
    }


}

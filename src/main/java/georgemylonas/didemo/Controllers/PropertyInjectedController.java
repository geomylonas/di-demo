package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingService;
import georgemylonas.didemo.Services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.say_Greeting();
    }


}

package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String say_Hello(){
        return greetingService.say_Greeting();
    }
}

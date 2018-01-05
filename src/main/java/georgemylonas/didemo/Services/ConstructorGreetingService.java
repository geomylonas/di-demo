package georgemylonas.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String say_Greeting(){
        return "Hello, i was injected via constructor";
    }
}

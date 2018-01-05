package georgemylonas.didemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String say_Greeting(){
        return "This is primary Greetings";
    }
}

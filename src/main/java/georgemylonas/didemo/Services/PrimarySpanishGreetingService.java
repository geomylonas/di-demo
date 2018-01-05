package georgemylonas.didemo.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String say_Greeting(){
        return "This is primary Spanish Greetings";
    }
}

package georgemylonas.didemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimarySpanishGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    @Autowired
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }



    @Override
    public String say_Greeting(){

        return greetingRepository.getSpanishGreeting();
    }
}

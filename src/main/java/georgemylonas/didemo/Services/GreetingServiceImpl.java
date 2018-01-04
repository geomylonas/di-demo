package georgemylonas.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS="Hello Gurus!!!";

    @Override
    public String say_Greeting(){
        return HELLO_GURUS;
    }
}

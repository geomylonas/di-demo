package georgemylonas.didemo.Services;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreatingService(String lang){

        switch(lang){
            case "en":
                    return new PrimaryGreetingService(greetingRepository);
            case "de":
                    return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                    return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }


}

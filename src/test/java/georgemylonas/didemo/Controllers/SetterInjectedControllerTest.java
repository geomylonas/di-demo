package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @Before
    public void setup() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}

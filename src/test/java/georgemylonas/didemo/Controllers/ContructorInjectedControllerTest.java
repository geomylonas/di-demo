package georgemylonas.didemo.Controllers;

import georgemylonas.didemo.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup() throws Exception{
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void test() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}

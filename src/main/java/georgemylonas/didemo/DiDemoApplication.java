package georgemylonas.didemo;

import georgemylonas.didemo.Controllers.ConstructorInjectedController;
import georgemylonas.didemo.Controllers.MyController;
import georgemylonas.didemo.Controllers.PropertyInjectedController;
import georgemylonas.didemo.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController  controller=(MyController)ctx.getBean("myController");
		System.out.println(controller.say_Hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}

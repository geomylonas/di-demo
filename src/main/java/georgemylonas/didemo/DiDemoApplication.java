package georgemylonas.didemo;

import georgemylonas.didemo.Controllers.ConstructorInjectedController;
import georgemylonas.didemo.Controllers.MyController;
import georgemylonas.didemo.Controllers.PropertyInjectedController;
import georgemylonas.didemo.Controllers.SetterInjectedController;
import georgemylonas.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController  controller=(MyController)ctx.getBean("myController");
		FakeDataSource fakeDataSource=(FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());

	}
}

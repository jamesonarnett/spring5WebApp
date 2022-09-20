package ajameson.springWeb2;

import ajameson.springWeb2.controllers.ConstructorInjectionController;
import ajameson.springWeb2.controllers.MyController;
import ajameson.springWeb2.controllers.PropertyInjectionController;
import ajameson.springWeb2.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWeb2Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringWeb2Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("-------------Property");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.sayGreeting());

		System.out.println("---------------Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.sayGreeting());

		System.out.println("------------Constructor");
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.sayGreeting());

	}

}

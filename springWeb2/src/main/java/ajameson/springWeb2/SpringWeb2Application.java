package ajameson.springWeb2;

import ajameson.springWeb2.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWeb2Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringWeb2Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("-------------Primary Bean");
		System.out.println(myController.sayHello());

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

package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
@Component
public class App {

    @Autowired
    HelloService helloService;

    public void sayHello() {
        System.out.println(helloService.sayHello("John"));
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        App app = context.getBean(App.class);
        app.sayHello();

        /*
         * // Créez un contexte d'application Spring
         * AnnotationConfigApplicationContext context = new
         * AnnotationConfigApplicationContext();
         * 
         * // Enregistrez la classe de configuration du contexte Spring
         * context.register(AppConfig.class);
         * 
         * // Rafraîchissez le contexte pour initialiser les beans
         * context.refresh();
         * 
         * // Obtenez un bean à partir du contexte
         * HelloService helloService = context.getBean(HelloService.class);
         * 
         * // Appelez une méthode sur le bean
         * String message = helloService.sayHello("John");
         * 
         * // Affichez le message
         * System.out.println(message);
         * 
         * // Obtenez tous les noms des beans (composants) dans le contexte
         * String[] beanNames = context.getBeanDefinitionNames();
         * 
         * // Parcourez les noms des beans et affichez-les
         * for (String beanName : beanNames) {
         * System.out.println(beanName);
         * }
         * 
         * // Fermez le contexte
         * context.close();
         */
    }
}

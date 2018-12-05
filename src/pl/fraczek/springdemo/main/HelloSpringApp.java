package pl.fraczek.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.springdemo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        final Coach coach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println("From bean:");
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}

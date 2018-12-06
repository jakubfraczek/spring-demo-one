package pl.fraczek.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.springdemo.coaches.Coach;
import pl.fraczek.springdemo.coaches.SwimmingCoach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SetterDemoApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            final SwimmingCoach swimmingCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);
            System.out.println(swimmingCoach.getDailyWorkout());
            System.out.println(swimmingCoach.getDailyFortune());
            System.out.println(swimmingCoach.getTeamName());
            System.out.println(swimmingCoach.getEmail());
        }
    }
}

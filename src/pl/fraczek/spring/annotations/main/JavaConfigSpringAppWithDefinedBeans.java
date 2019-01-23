package pl.fraczek.spring.annotations.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.fraczek.spring.annotations.coaches.Coach;
import pl.fraczek.spring.annotations.configuration.SportConfig;
import pl.fraczek.spring.annotations.configuration.SwimConfig;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class JavaConfigSpringAppWithDefinedBeans {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SwimConfig.class)) {
            Coach coach = context.getBean("swimCoach", Coach.class);
            System.out.println("Hi, it's java configured app with defined beans");
            System.out.println(coach.getDailyFortune());
            System.out.println(coach.getDailyWorkout());
        }

    }

}

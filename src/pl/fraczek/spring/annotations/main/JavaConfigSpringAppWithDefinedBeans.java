package pl.fraczek.spring.annotations.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.fraczek.spring.annotations.coaches.Coach;
import pl.fraczek.spring.annotations.configuration.SportConfig;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class JavaConfigSpringAppWithDefinedBeans {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class)) {
            Coach coach = context.getBean("tennisCoach", Coach.class);
            System.out.println("Hi, it's java configured app");
            System.out.println(coach.getDailyFortune());
            System.out.println(coach.getDailyWorkout());
        }

    }

}

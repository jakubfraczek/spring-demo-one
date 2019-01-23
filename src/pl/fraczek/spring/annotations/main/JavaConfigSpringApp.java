package pl.fraczek.spring.annotations.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.fraczek.spring.annotations.coaches.VolleyballCoach;
import pl.fraczek.spring.annotations.configuration.SportConfig;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class JavaConfigSpringApp {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class)) {
            VolleyballCoach coach = context.getBean("volleyballCoach", VolleyballCoach.class);
            System.out.println("Hi, it's java configured app");
            System.out.println(coach.getDailyFortune());
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getMail());
            System.out.println(coach.getTeam());
        }

    }

}

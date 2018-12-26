package pl.fraczek.spring.annotations.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.annotations.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class springApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/annotations/configuration/applicationContext.xml")) {
            final Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
            System.out.println(tennisCoach.getDailyWorkout());
        }
    }
}

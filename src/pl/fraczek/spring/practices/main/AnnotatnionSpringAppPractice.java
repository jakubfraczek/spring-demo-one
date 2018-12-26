package pl.fraczek.spring.practices.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.annotations.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class AnnotatnionSpringAppPractice {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/practices/configuration/myPracticeAnnotation-applicationContext.xml")) {
            final Coach skiCoach = context.getBean("skiCoach", Coach.class);
            System.out.println(skiCoach.getDailyWorkout());
        }

    }
}

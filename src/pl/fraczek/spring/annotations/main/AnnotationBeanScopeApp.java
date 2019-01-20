package pl.fraczek.spring.annotations.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.annotations.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class AnnotationBeanScopeApp {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/annotations/configuration/applicationContext.xml")) {

            Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
            Coach anotherTennisCoach = context.getBean("tennisCoach", Coach.class);

            boolean isSameCoach = (tennisCoach == anotherTennisCoach);

            System.out.println("\nPointing same object: " + isSameCoach);
            System.out.println("\nMemory location of tennisCoach: " + tennisCoach);
            System.out.println("\nMemory location of anotherTennisCoach: " + anotherTennisCoach);
        }
    }
}

package pl.fraczek.spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.demo.coaches.TennisCoach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class PropertyDemoApp {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/demo/configuration/applicationContext.xml")) {
            final TennisCoach myTennisCoach = context.getBean("myTennisCoach", TennisCoach.class);
            System.out.println(myTennisCoach.getTeamName());
        }

    }
}

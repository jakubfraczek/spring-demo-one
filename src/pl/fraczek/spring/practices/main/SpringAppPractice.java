package pl.fraczek.spring.practices.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.practices.coaches.MyBikeCoach;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SpringAppPractice {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/practices/configuration/myPractice-applicationContext.xml")) {

            final MyBikeCoach coach = context.getBean("myCoach", MyBikeCoach.class);
            printTime();
            System.out.println(coach);
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());

            final MyBikeCoach anotherCoach = context.getBean("myCoach", MyBikeCoach.class);
            printTime();
            System.out.println(anotherCoach);
            System.out.println(anotherCoach.getDailyWorkout());
            System.out.println(anotherCoach.getDailyFortune());
        }
    }

    private static void printTime() {
        DateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/YYYY");
        System.out.println(format.format(new Date()));
    }
}

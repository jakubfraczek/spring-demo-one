package pl.fraczek.spring.practices.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.practices.coaches.BikeParticipant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SpringAppPractice {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/practices/configuration/myPractice-applicationContext.xml")) {

            final BikeParticipant participant = context.getBean("myParticipant", BikeParticipant.class);
            printTime();
            System.out.println(participant);
            System.out.println(participant.myDailyPractice());
            System.out.println(participant.myDailyFortune());

            final BikeParticipant anotherParticipant = context.getBean("myParticipant", BikeParticipant.class);
            printTime();
            System.out.println(anotherParticipant);
            System.out.println(anotherParticipant.myDailyPractice());
            System.out.println(anotherParticipant.myDailyFortune());
        }
    }

    private static void printTime() {
        DateFormat format = new SimpleDateFormat("hh:mm:ss dd/MM/YYYY");
        System.out.println(format.format(new Date()));
    }
}

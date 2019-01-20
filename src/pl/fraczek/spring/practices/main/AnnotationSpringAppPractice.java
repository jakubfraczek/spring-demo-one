package pl.fraczek.spring.practices.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.practices.participants.Participant;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class AnnotationSpringAppPractice {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/practices/configuration/myPracticeAnnotation-applicationContext.xml")) {
            final Participant skiParticipant = context.getBean("skiParticipant", Participant.class);
            System.out.println(skiParticipant.myDailyPractice());
            System.out.println(skiParticipant.myDailyFortune());
        }

    }
}

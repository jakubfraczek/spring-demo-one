package pl.fraczek.spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.demo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class InitDestroyDemo {

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/demo/configuration/initAndDestroy-applicationContext.xml")) {

            final Coach myCoach = context.getBean("myCoach", Coach.class);

        }
    }
}

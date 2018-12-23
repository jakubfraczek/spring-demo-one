package pl.fraczek.springdemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.springdemo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class InitDestroyDemo {

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("initAndDestroy-applicationContext.xml")) {

            final Coach myCoach = context.getBean("myCoach", Coach.class);

        }
    }
}

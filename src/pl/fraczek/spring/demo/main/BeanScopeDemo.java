package pl.fraczek.spring.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.fraczek.spring.demo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class BeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pl/fraczek/spring/demo/configuration/scopeBean-applicationContext.xml");

        final Coach myCoach = context.getBean("myCoach", Coach.class);
        final Coach alphaCoach = context.getBean("myCoach", Coach.class);

        final boolean myCoachResult = myCoach == alphaCoach;
        System.out.println(myCoachResult);
        System.out.println("Memory reference for myCoach: " + myCoach);
        System.out.println("Memory reference for alphaCoach: " + alphaCoach);

        final Coach yourCoach = context.getBean("yourCoach", Coach.class);
        final Coach betaCoach = context.getBean("yourCoach", Coach.class);

        final boolean yourCoachResult = yourCoach == alphaCoach;
        System.out.println(yourCoachResult);
        System.out.println("Memory reference for yourCoach: " + myCoach);
        System.out.println("Memory reference for betaCoach: " + betaCoach);

    }
}

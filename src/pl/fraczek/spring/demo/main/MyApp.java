package pl.fraczek.spring.demo.main;

import pl.fraczek.spring.demo.coaches.BaseballCoach;
import pl.fraczek.spring.demo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}

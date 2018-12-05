package pl.fraczek.springdemo.main;

import pl.fraczek.springdemo.coaches.BaseballCoach;
import pl.fraczek.springdemo.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}

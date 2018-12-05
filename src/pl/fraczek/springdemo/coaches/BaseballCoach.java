package pl.fraczek.springdemo.coaches;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Stretch for 30 minutes and bat some";
    }
}

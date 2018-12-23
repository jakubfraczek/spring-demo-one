package pl.fraczek.springdemo.coaches;

import pl.fraczek.springdemo.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void startUpMethod() {
        System.out.println("Track coach arrived!");
    }

    public void closeDownMethod() {
        System.out.println("Track coach is going home!");
    }
}

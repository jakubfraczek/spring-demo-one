package pl.fraczek.spring.demo.coaches;

import pl.fraczek.spring.demo.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    BaseballCoach(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Stretch for 30 minutes and bat some";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

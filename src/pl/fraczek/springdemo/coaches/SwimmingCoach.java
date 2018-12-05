package pl.fraczek.springdemo.coaches;

import pl.fraczek.springdemo.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    SwimmingCoach() {
    }

    public void setFortuneService(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 20 lengths of the pool";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}

package pl.fraczek.spring.annotations.coaches;

import pl.fraczek.spring.annotations.services.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(final FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Swim 1000 meters";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}

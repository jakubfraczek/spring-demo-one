package pl.fraczek.spring.annotations.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.fraczek.spring.annotations.services.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class VolleyballCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Serve 20 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

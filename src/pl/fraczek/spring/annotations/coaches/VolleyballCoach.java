package pl.fraczek.spring.annotations.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.fraczek.spring.annotations.services.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class VolleyballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Value("${volleyball.mail}")
    private String mail;

    @Value("${volleyball.team}")
    private String team;

    @Override
    public String getDailyWorkout() {

        return "Serve 20 times!";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

    public String getMail() {

        return mail;
    }

    public String getTeam() {

        return team;
    }
}

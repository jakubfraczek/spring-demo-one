package pl.fraczek.spring.practices.participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.fraczek.spring.practices.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class SwimParticipant implements Participant {

    @Autowired
    @Qualifier("randomFortune")
    private FortuneService fortuneService;

    @Value("${swim.mail}")
    private String email;

    @Value("${swim.mail}")
    private String teamName;

    @Override

    public String myDailyPractice() {

        return "Swim something or whatever";
    }

    @Override
    public String myDailyFortune() {

        return fortuneService.getFortune();
    }

    public String getEmail() {

        return email;
    }

    public String getTeamName() {

        return teamName;
    }
}

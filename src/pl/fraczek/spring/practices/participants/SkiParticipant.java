package pl.fraczek.spring.practices.participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.fraczek.spring.practices.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class SkiParticipant implements Participant {

    @Autowired
    @Qualifier("fileFortuneService")
    FortuneService fortuneService;

    @Override
    public String myDailyPractice() {
        return "Do something!";
    }

    @Override
    public String myDailyFortune() {
        return fortuneService.getFortune();
    }

}

package pl.fraczek.spring.practices.coaches;

import org.springframework.stereotype.Component;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class SkiParticipant implements Participant {

    @Override
    public String myDailyPractice() {
        return "Do something!";
    }

}

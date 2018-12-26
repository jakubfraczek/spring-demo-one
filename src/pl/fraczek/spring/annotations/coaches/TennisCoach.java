package pl.fraczek.spring.annotations.coaches;

import org.springframework.stereotype.Component;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component("someCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice serves";
    }
}

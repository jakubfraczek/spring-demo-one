package pl.fraczek.spring.practices.coaches;

import org.springframework.stereotype.Component;
import pl.fraczek.spring.annotations.coaches.Coach;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class SkiCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do something!";
    }
}

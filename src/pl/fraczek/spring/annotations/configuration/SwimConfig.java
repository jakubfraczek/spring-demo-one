package pl.fraczek.spring.annotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.fraczek.spring.annotations.coaches.Coach;
import pl.fraczek.spring.annotations.coaches.SwimCoach;
import pl.fraczek.spring.annotations.services.FortuneService;
import pl.fraczek.spring.annotations.services.SadFortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Configuration
public class SwimConfig {

    @Bean
    public FortuneService sadFortune() {

        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {

        return new SwimCoach(sadFortune());
    }
}

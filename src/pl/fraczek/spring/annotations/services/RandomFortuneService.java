package pl.fraczek.spring.annotations.services;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {
            "Beware of black volga",
            "The journey is the reward",
            "Good plan is half od success"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {

        int index = random.nextInt(fortunes.length);

        return fortunes[index];
    }
}

package pl.fraczek.spring.practices.fortune;


import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class RandomFortune implements FortuneService {

    private String[] fortunes = {"You gonna loose today.", "Fortune is quite normal for you today.", "Today is your lucky day!"};

    @Override
    public String getFortune() {
        return fortunes[getRandomNumber()];
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(fortunes.length);
    }
}

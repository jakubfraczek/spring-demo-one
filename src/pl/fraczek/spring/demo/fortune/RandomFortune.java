package pl.fraczek.spring.demo.fortune;

import java.util.Random;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class RandomFortune implements FortuneService {

    private String[] fortunes = {"You gonna loose today.", "Fortune is quite normal for you today.", "Today is your lucky day!"};

    @Override
    public String getFortune() {
        Random random = new Random();
        final int randomNumber = random.nextInt(3);
        return fortunes[randomNumber];
    }
}

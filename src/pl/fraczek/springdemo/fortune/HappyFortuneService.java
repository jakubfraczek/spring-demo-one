package pl.fraczek.springdemo.fortune;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}

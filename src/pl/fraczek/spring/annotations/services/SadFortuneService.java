package pl.fraczek.spring.annotations.services;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {

        return "Today is a sad day";
    }
}

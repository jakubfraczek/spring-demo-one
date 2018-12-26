package pl.fraczek.spring.annotations.services;

import org.springframework.stereotype.Component;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is a good day!";
    }
}

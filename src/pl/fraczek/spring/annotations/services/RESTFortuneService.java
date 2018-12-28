package pl.fraczek.spring.annotations.services;

import org.springframework.stereotype.Component;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}

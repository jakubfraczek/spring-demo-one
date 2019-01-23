package pl.fraczek.spring.annotations.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Configuration
@ComponentScan("pl.fraczek.spring.annotations")
@PropertySource("classpath:pl/fraczek/spring/annotations/sport.properties")
public class SportConfig {

}

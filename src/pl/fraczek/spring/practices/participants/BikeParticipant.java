package pl.fraczek.spring.practices.participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.fraczek.spring.practices.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class BikeParticipant implements Participant {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public BikeParticipant(FortuneService fortuneService, final String email, final String teamName) {

        this.fortuneService = fortuneService;
        this.email = email;
        this.teamName = teamName;
    }

    @Override
    public String myDailyPractice() {

        return "Bike 100 km!";
    }

    @Autowired
    @Qualifier("fileFortuneService")
    public String myDailyFortune() {

        return fortuneService.getFortune();
    }

    public void hello() {

        System.out.println("Welcome into the training!");
    }

    public void goodbye() {

        System.out.println("Thaks! Have a nice day!");
    }

    public String getEmail() {

        return email;
    }

    public String getTeamName() {

        return teamName;
    }
}

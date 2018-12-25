package pl.fraczek.spring.practices.coaches;

import pl.fraczek.spring.demo.coaches.Coach;
import pl.fraczek.spring.demo.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class MyBikeCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    public MyBikeCoach(FortuneService fortuneService, final String email, final String teamName) {
        this.fortuneService = fortuneService;
        this.email = email;
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Bike 100 km!";
    }

    @Override
    public String getDailyFortune() {
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

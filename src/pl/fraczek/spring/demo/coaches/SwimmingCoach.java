package pl.fraczek.spring.demo.coaches;

import pl.fraczek.spring.demo.fortune.FortuneService;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String teamName;

    SwimmingCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 20 lengths of the pool";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void setFortuneService(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(final String teamName) {
        this.teamName = teamName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }
}

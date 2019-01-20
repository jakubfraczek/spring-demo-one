package pl.fraczek.spring.practices.fortune;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author <a href=mailto:Jakub.Fraczek@tomtom.com>Jakub Fraczek</a>
 */
@Component
public class FileFortuneService implements FortuneService {

    private File file = new File("C:\\Workspace\\projects\\priv\\spring-demo-one\\src\\pl\\fraczek\\spring\\practices\\fortune.txt");
    private List<String> fortunes = new ArrayList<>();

    @PostConstruct
    private void readFile() {

        System.out.println("Reading file...");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String statement;
            while ((statement = br.readLine()) != null) {
                fortunes.add(statement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("File read successfully!");
    }

    @Override
    public String getFortune() {

        return fortunes.get(getRandomNumber());
    }

    private int getRandomNumber() {

        Random random = new Random();
        return random.nextInt(fortunes.size());
    }
}

package team3.javaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CodingChallengeTeam3Application {

	public static void main(String[] args) {
		SpringApplication.run(CodingChallengeTeam3Application.class, args);
		
	}

}

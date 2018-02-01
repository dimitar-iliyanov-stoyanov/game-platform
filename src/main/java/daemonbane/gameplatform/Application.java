package daemonbane.gameplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import daemonbane.gameplatform.domain.Army;
import daemonbane.gameplatform.domain.Hero;
import daemonbane.gameplatform.domain.Weapon;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Hero hero() {
		return new Hero(new Weapon(1), 10);
	}

	@Bean
	public Army army() {
		return new Army(0, 100);
	}

}
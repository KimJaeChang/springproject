package kjc.kjcspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KjcSpringApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		System.setProperty("spring.devtools.livereload.enabled", "true");
		SpringApplication.run(KjcSpringApplication.class, args);
	}

}

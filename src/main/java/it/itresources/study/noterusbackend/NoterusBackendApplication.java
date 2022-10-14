package it.itresources.study.noterusbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication()
@Configuration
@EnableJpaAuditing
public class NoterusBackendApplication {

	private static final Logger log = LoggerFactory.getLogger(NoterusBackendApplication.class);

	public static void main(String[] args) {
		log.debug("Starting application");
		SpringApplication.run(NoterusBackendApplication.class, args);
	}

}

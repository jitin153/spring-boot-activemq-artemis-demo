package ca.amq.artemis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class MessagePublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePublisherApplication.class, args);
	}
}

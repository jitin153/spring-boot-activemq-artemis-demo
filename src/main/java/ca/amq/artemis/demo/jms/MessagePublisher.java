package ca.amq.artemis.demo.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {
	private static final Logger LOG = LoggerFactory.getLogger(MessagePublisher.class);

	@Value("${test.msg.queue}")
	private String destinationQueue;

	@Autowired
	private JmsTemplate jmsTemplate;

	public String publish(String message) {
		try {
			jmsTemplate.convertAndSend(destinationQueue, message);
			LOG.info("Message published: {}", message);
			return "Message has been successfully published.";
		} catch (Exception e) {
			LOG.error("Error occurred while publishing message from '{}' queue.\nError - {}", destinationQueue, e);
			return "Oops...something went wrong while publishing message.";
		}
	}
}

package ca.amq.artemis.demo.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	private static final Logger LOG = LoggerFactory.getLogger(MessageConsumer.class);

	@JmsListener(destination = "${test.msg.queue}")
	public void receive(String message) {
		LOG.info("Message recieved: {}", message);
	}
}

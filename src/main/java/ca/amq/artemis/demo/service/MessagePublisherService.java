package ca.amq.artemis.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.amq.artemis.demo.jms.MessagePublisher;

@Service
public class MessagePublisherService {

	private static final Logger LOG = LoggerFactory.getLogger(MessagePublisherService.class);

	@Autowired
	private MessagePublisher messagePublisher;

	public String publishMessage(String message) {
		return messagePublisher.publish(message);
	}
}

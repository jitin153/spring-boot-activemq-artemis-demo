package ca.amq.artemis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ca.amq.artemis.demo.service.MessagePublisherService;

@RestController
public class MessagePublishController {

	@Autowired
	private MessagePublisherService poolPricePublisherService;

	@GetMapping("/publish/{msg}")
	public String publishMessage(@PathVariable("msg") String message) {
		return poolPricePublisherService.publishMessage(message);
	}
}

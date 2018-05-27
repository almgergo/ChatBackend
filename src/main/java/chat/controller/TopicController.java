package chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import chat.domain.Topic;
import chat.service.TopicService;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller for topic lookup.
 *
 * @author almge
 *
 */
@RestController
@Slf4j
public class TopicController extends ApiController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/allTopics")
	public List<Topic> index() {
		log.debug("All topics queried");
		return this.topicService.getAllTopics();
	}

	@GetMapping("/registerNewTopic")
	public Topic addTopic(@RequestParam final String topicName) {
		log.info("New topic requested: {}", topicName);
		return this.topicService.registerNewTopic(topicName);
	}

}
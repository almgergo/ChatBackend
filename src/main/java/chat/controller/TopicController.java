package chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for topic lookup.
 *
 * @author almge
 *
 */
@RestController
public class TopicController extends ApiController {

	@GetMapping("/topic")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
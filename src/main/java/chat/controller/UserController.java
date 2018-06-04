package chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import chat.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller for user lookup.
 *
 * @author almge
 *
 */
@RestController
@Slf4j
public class UserController extends ApiController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/register")
	public Long index() {
		log.debug("All topics queried");
		return this.userService.registerUser().getId();
	}

}
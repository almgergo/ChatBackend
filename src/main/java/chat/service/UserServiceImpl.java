package chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chat.domain.User;
import chat.repository.UserRepository;

/**
 * User service implementation.
 *
 * @author almge
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser() {
		return this.userRepository.save(new User());
	}

}

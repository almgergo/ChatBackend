package chat.service;

import java.util.List;

import chat.domain.Topic;

/**
 * Topic service
 *
 * @author almge
 *
 */
public interface TopicService {

	public Topic getTopic(Long id);

	public void saveTopic(Topic topic);

	public List<Topic> getTopicsMatching(String topicName);

}

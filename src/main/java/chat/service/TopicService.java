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

	public Topic getTopic(final String name);

	public Topic saveTopic(Topic topic);

	public List<Topic> getTopicsMatching(String topicName);

	public List<Topic> getAllTopics();

	public Topic registerNewTopic(String topicName);

}

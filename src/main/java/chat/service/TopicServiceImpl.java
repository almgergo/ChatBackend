package chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chat.domain.Topic;
import chat.repository.TopicRepository;

/**
 * Topic service implementation.
 *
 * @author almge
 *
 */
@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicRepository topicRepository;

	@Override
	public Topic getTopic(final Long id) {
		return this.topicRepository.findOne(id);
	}

	@Override
	public void saveTopic(final Topic topic) {
		this.topicRepository.save(topic);
	}

	@Override
	public List<Topic> getTopicsMatching(final String topicName) {
		// return
		// Lists.newArrayList(this.topicRepository.findAll(QTopic.topic.name.containsIgnoreCase(topicName)));
		return null;
	}

}

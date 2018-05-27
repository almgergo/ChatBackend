package chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import chat.domain.QTopic;
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
	public Topic getTopic(final String name) {
		return this.topicRepository.findOne(name);
	}

	@Override
	public Topic saveTopic(final Topic topic) {
		return this.topicRepository.save(topic);
	}

	@Override
	public List<Topic> getTopicsMatching(final String topicName) {
		return Lists.newArrayList(this.topicRepository.findAll(QTopic.topic.name.containsIgnoreCase(topicName)));
	}

	@Override
	public List<Topic> getAllTopics() {
		return this.topicRepository.findAll();
	}

	@Override
	public Topic registerNewTopic(final String name) {
		Topic topic = this.getTopic(name);
		if (topic == null) {
			topic = this.saveTopic(Topic.builder().name(name).searchCount(0L).build());
		}
		return topic;
	}

}

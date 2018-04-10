package chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import chat.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>, QueryDslPredicateExecutor<Topic> {

}

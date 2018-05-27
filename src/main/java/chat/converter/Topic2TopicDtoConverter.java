package chat.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import chat.domain.Topic;
import chat.dto.TopicDto;

/**
 * Topic 2 dto converter.
 * 
 * @author almge
 *
 */
@Component
public class Topic2TopicDtoConverter implements Converter<Topic, TopicDto> {

	@Override
	public TopicDto convert(final Topic source) {
		TopicDto target = new TopicDto();

		BeanUtils.copyProperties(source, target);

		return target;
	}

}

package chat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Topic dto for frontend.
 *
 * @author almge
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicDto {

	private Long id;
	private String name;
	private Long searchCount;
}

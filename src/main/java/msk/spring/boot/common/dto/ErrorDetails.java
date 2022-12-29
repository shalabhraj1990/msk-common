 package msk.spring.boot.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
	private int code;
	private String message;
	//@JsonInclude(Include. NON_NULL)
	private String printStackTrace;
}

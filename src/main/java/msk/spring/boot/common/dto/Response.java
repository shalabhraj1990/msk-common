package msk.spring.boot.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> {
	//@JsonInclude(Include.NON_NULL)
	private T data;
	//@JsonInclude(Include.NON_NULL)
	private T errors;

}

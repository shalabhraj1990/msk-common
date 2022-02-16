package msk.spring.boot.common.mobile.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileClientDto {
	private int id;
	private String accessoryType;
	private String countryCode;
	private String lineOfBussiness;
	private String name;
	private double price;
	private LocalDate publicationDate;
	private String status;
	private Country country;
	private List<MobileAccessoryDto> accessoryInfo;
}

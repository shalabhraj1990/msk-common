package msk.spring.boot.common.mobile.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import msk.spring.boot.common.mobile.dto.LineOfBussiness;
import msk.spring.boot.common.mobile.dto.Status;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Mobile {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "accessory_type")
	private String accessoryType;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "line_of_business")
	private LineOfBussiness lineOfBussiness;
	private String name;
	private Double price;
	@Column(name = "publicatoin_date")
	private LocalDate publicationDate;
	private Status status;//my sql this column will set to integer 
}

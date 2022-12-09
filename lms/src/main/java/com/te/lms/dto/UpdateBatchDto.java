
package com.te.lms.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.te.lms.entity.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateBatchDto {

	private String batchName;
	private String mentorName;
	private List<BatchTechnologiesDto> batchTechnologiesDto=new ArrayList<BatchTechnologiesDto>();
	private LocalDate startDate;
	private LocalDate endDate;
	

}

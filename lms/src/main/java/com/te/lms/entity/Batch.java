
package com.te.lms.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.id.enhanced.SequenceStyleGenerator;

import com.te.lms.entity.enums.AdminStatus;
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
@Entity
public class Batch {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "no")
	private Integer no;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batch_id")
	private Integer batchId;

	@Column(name = "batch_name")
	private String batchName;

	@Column(name = "mentor_name")
	private String mentorName;

	@Column(name = "technologies")
	@OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
	private List<BatchTechnologies> batchTechnologies = new ArrayList<BatchTechnologies>();

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status;

	@Enumerated(EnumType.STRING)
	private AdminStatus batchStatus;

	@OneToOne(mappedBy = "batch", cascade = CascadeType.ALL)
	private Mentor mentor;
	
	@OneToMany(mappedBy = "batch",cascade = CascadeType.ALL)
	private List<Employee> employee=new ArrayList<Employee>();

}

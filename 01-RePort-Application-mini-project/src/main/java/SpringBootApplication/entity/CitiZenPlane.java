package SpringBootApplication.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="CITIZEN_PLANS_INFO")
public class CitiZenPlane {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer citizenId;
private String citizenName;
private String gender;
private String planeName;
private String planStatus;
private LocalDate PlanStartDate;
private LocalDate PlanEndDate;
private String denialReason;
private String terminationrsn;
private LocalDate terminatedDate;
private Double benefitAmt;

}

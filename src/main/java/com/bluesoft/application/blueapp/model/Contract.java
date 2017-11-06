package com.bluesoft.application.blueapp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * @author Victor Chukwu
 *
 */
@Entity
@Table(name = "CONTRACTS")
public class Contract implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	@NotNull(message= "{NotNull.validation}")
	private Long id;
	
	@Column(name = "NUMBER", unique = true)
	@Pattern(regexp="[0-9]{1,4}/[0-9]{4}", message="{Pattern.Product.contract.validation}")
	@NotNull(message= "{NotNull.validation}")
	private String number;
	
	@OneToOne
    @JoinColumn(name= "NAME")
	private SystemModel system;
	
	@Column(name = "START_DATE")
	@DateTimeFormat(pattern="yyyy/MM/dd")
	@NotNull(message= "{NotNull.validation}")
	private LocalDate startDate;
	
	@Column(name = "END_DATE")
	@DateTimeFormat(pattern="yyyy/MM/dd")
	@NotNull(message= "{NotNull.validation}")
	private LocalDate endDate;
	
	@Column(name = "VALUE")
	@NotNull(message= "{NotNull.validation}")
	@Digits (message= "{Digits.value.validation",integer=7, fraction = 2)
	private BigDecimal value;
	
	@Column(name = "PERIOD")
	@NotNull(message= "{NotNull.validation}")
	private String  period;
	
	@Column(name = "ACTIVE")
	private Boolean isActive;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public SystemModel getSystem() {
		return system;
	}
	public void setSystem(SystemModel system) {
		this.system = system;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}

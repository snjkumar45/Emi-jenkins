package com.emi.application.entity;

 

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

@Entity
@Table(name = "User")
public class User {
	private String name;
	private String age;
	private String LoanType;
	private String tenure;
	private String remainingMonth;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private Long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getRemainingMonth() {
		return remainingMonth;
	}
	public void setRemainingMonth(String remainingMonth) {
		this.remainingMonth = remainingMonth;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
 
	
	
}

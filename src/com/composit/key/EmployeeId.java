package com.composit.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable {

	@Column(name = "company_id")
	private Long companyId;

	@Column(name = "employee_number")
	private Long employeeNumber;

	public EmployeeId() {
	}

	public EmployeeId(Long companyId, Long employeeId) {
		this.companyId = companyId;
		this.employeeNumber = employeeId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public Long getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		return true;
	}

}
// The Embeddable must be `Serializable` and we need to provide an
// implementation for `equals` and `hashCode`.
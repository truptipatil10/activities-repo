package in.org.npci.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "application_id")
	private int applicationId;
	
	@Column(name = "customer_id_ref")
	private int customerId;
	
	@Column(name = "loan_id_ref")
	private int loanId;
	
	@Column(name = "status")
	private String status;
	
	public LoanApplication() {
		super();
	}
	
	public LoanApplication(int customerId, int loanId) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

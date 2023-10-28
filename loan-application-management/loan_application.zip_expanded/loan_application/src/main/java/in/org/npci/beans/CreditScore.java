package in.org.npci.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_score")
public class CreditScore {
	@Id
	@Column(name = "pan")
	private String pan;
	
	@Column(name = "score")
	private int score;
	
	public CreditScore() {
		super();
	}

	public CreditScore(String pan, int score) {
		super();
		this.pan = pan;
		this.score = score;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

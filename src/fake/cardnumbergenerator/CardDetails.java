package fake.cardnumbergenerator;

import java.util.Date;

public class CardDetails {

	private String cardNumber;
	private int cvv;
	private String name;
	private Date expiryDate;
	private String cardType;
	public CardDetails(){
		
	}
	public CardDetails(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CardDetails [cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", name=" + name + ", expiryDate=" + expiryDate
				+ ", cardType=" + cardType + "]";
	}
}

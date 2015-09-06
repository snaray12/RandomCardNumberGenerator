package fake.cardnumbergenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.fluttercode.datafactory.impl.DataFactory;

public abstract class AbstractCard implements Card {
	static final Random random = new Random(System.currentTimeMillis());
	
	public CardDetails getCardDetails(){
		DataFactory df = new DataFactory();
		CardDetails cd = new CardDetails();
		cd.setCardNumber(generateCardNumber());
		cd.setName(df.getName());
		cd.setCvv(RandomNumberGenerator.getRandomNumber(100, 999));
		Date now = Calendar.getInstance().getTime();
		Calendar futureCalendar = Calendar.getInstance();
		futureCalendar.set(2016, Calendar.JANUARY, 1);
		Date future = futureCalendar.getTime();
		cd.setExpiryDate(df.getDateBetween(now, future));
		cd.setCardType(getCardType());
		return cd;
	}
	
	public String generateCardNumber() {
		int length = getRandomNumberLength();
		String bin = generatePrefix();
		int binLength = bin.length();
		int randomNumberLength = length-(bin.length()+1);
		StringBuilder sb = new StringBuilder(bin);
		while(randomNumberLength>0){
			int digit = this.random.nextInt(10);
			sb.append(digit);
			randomNumberLength--;
		}
		int checkDigit = getCheckDigit(sb.toString());
		sb.append(checkDigit);
		return sb.toString();
	}
	
	private int getCheckDigit(String number){
		int sum=0;
		for (int i=0;i<number.length();i++){
			int digit = Integer.parseInt(number.substring(i,(i+1)));
			if((i%2)==0){
				digit = digit *2;
				if(digit > 9) {
					digit = (digit/10)+(digit % 10);
				}
			}
			sum += digit;
		}
		int mod = sum % 10;
		return ((mod ==0)?0:10-mod);
	}
	public abstract Integer getRandomNumberLength();
	public abstract String generatePrefix();
	public abstract String getCardType();
}

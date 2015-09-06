package fake.cardnumbergenerator;

import java.util.ArrayList;
import java.util.List;

public class VisaCard extends AbstractCard {
	private final List<Integer> visaLengthList = new ArrayList<Integer>();
	public VisaCard(){
		visaLengthList.add(13);
		visaLengthList.add(16);
	}

	@Override
	public String generatePrefix() {
		return String.valueOf(4);
	}
	
	public List<Integer> getVisaLengthList(){
		return visaLengthList;
	}

	@Override
	public Integer getRandomNumberLength() {
		return RandomNumberGenerator.getRandomNumberFromList(getVisaLengthList());
	}

	@Override
	public String getCardType() {
		return "VISA";
	}
}

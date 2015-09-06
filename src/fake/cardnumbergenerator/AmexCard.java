package fake.cardnumbergenerator;

import java.util.ArrayList;
import java.util.List;

public class AmexCard extends AbstractCard {
	private final List<Integer> amexPrefixList = new ArrayList<Integer>();
	
	public AmexCard(){
		amexPrefixList.add(34);
		amexPrefixList.add(37);
	}
	@Override
	public String generatePrefix() {
		return String.valueOf(RandomNumberGenerator.getRandomNumberFromList(getAmexPrefixList()));
	}
	
	private List<Integer> getAmexPrefixList() {
		return amexPrefixList;
	}

	@Override
	public Integer getRandomNumberLength() {
		return 15;
	}
	@Override
	public String getCardType() {
		return "AMEX";
	}
}

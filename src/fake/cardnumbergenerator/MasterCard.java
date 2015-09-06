	package fake.cardnumbergenerator;

public class MasterCard extends AbstractCard {
	
	public MasterCard(){
		
	}

	@Override
	public String generatePrefix() {
		return String.valueOf(RandomNumberGenerator.getRandomNumber(51,55));
	}

	@Override
	public Integer getRandomNumberLength() {
		return 16;
	}

	@Override
	public String getCardType() {
		return "MASTER";
	}
}

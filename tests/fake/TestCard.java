package fake;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fake.cardnumbergenerator.Card;
import fake.cardnumbergenerator.CardFactory;
import fake.cardnumbergenerator.RandomNumberGenerator;

public class TestCard {

	List<String> cardTypes = new ArrayList<String>();
	@Before
	public void setUp() throws Exception {
		cardTypes.add("AMEX");
		cardTypes.add("VISA");
		cardTypes.add("MASTER");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		for (int i=0;i<10;i++){
			String val = RandomNumberGenerator.getRandomValueFromList(cardTypes);
			Card card = CardFactory.getCard(val);
			System.out.println(card.getCardDetails());			
		}
	}

}

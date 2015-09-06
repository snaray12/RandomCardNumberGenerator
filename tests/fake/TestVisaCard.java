package fake;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import fake.cardnumbergenerator.CardDetails;
import fake.cardnumbergenerator.VisaCard;

public class TestVisaCard {
	VisaCard vc;
	List<Integer> integerList;
	
	@Before
	public void setUp() throws Exception {
		integerList = new ArrayList<Integer>();
		integerList.add(13);
		integerList.add(16);
		vc = new VisaCard();
//		vc = mock(VisaCard.class);
//		when(vc.generatePrefix()).thenCallRealMethod();
//		when(vc.getRandomNumberLength()).thenReturn(16);
//		when(vc.generateCardNumber()).thenCallRealMethod();
	}

	@After
	public void tearDown() throws Exception {
		integerList = null;
		vc = null;
	}

	@Test
	public void testGetRandomNumberLength() {
			int number = vc.getRandomNumberLength();
			System.out.println("Random Number length is : "+number);
			assertTrue("Value returned present in the list", integerList.contains(number));
	}
	
	@Test
	public void testGenerateCardNumber(){
		CardDetails cd = vc.getCardDetails();
		System.out.println("Card Number is : "+cd);
		System.out.println("Length of card number is : "+ cd.getCardNumber().length());
		assertTrue(integerList.contains(cd.getCardNumber().length()));
	}
}

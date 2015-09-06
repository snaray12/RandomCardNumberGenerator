package fake;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fake.cardnumbergenerator.CardDetails;
import fake.cardnumbergenerator.MasterCard;


public class TestMasterCard {
	MasterCard mc;
	List<String> prefixList;

	@Before
	public void setUp() throws Exception {
		prefixList = new ArrayList<String>();
		prefixList.add(String.valueOf(51));
		prefixList.add(String.valueOf(52));
		prefixList.add(String.valueOf(53));
		prefixList.add(String.valueOf(54));
		prefixList.add(String.valueOf(55));
		mc = new MasterCard();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGeneratePrefix() {
//		for(int i =0; i<10;i++){
			String prerfix = mc.generatePrefix();
			System.out.println(prerfix);
			assertTrue(prefixList.contains(prerfix));
//		}
	}
	@Test
	public void testGenerateCardNumber(){
		CardDetails cd = mc.getCardDetails();
		System.out.println("Card Number is : "+cd);
		System.out.println("Length of card number is : "+ cd.getCardNumber().length());
		assertEquals(16, cd.getCardNumber().length());
	}

}

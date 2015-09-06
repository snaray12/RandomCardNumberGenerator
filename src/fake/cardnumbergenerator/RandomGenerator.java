package fake.cardnumbergenerator;

import java.util.List;
import java.util.Random;

public class RandomGenerator<T> {
	
	public T getRandomValueFromList(List<T> list){
		Random random = new Random();
		int index = random.nextInt(list.size());
		return list.get(index);
	}

}

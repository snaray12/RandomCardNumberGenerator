package fake.cardnumbergenerator;

import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {

	public static Integer getRandomNumberFromList(List<Integer> list){
		RandomGenerator<Integer> rg = new RandomGenerator<Integer>();
		return rg.getRandomValueFromList(list);
	}
	public static Integer getRandomNumber(Integer min, Integer max){
		return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
	}
	public static Long getRandomNumber(Long minNumber, Long maxNumber) {
		return (long) (Math.floor(Math.random() * (maxNumber - minNumber + 1)) + minNumber);
	}
	public static Long getMin(Integer digits){
		Long min=1000000000L;
		while(!isDigitSizeEqual(min, digits)){
			min++;
		}
		return min;
	}
	private static boolean isDigitSizeEqual(Long n, Integer digits) {
		int length = numberOfElements(n);
		boolean isEqual = false;
		if (digits == length){
			isEqual = true;
		}
		return isEqual;
	}
	private static int numberOfElements(Long n){
		int count=0;
	    while(n!=0){
	        n=(long)n/10;
	        count++;
	    }
	    return count;
	}
	public static Long getMax(Integer digits){
		return null;
	}
	public static int getDigitCount(int n) {
		return (int)(Math.log10(n)+1);
	}
	public static String getRandomValueFromList(List<String> cardTypes) {
		RandomGenerator<String> rg = new RandomGenerator<String>();
		return rg.getRandomValueFromList(cardTypes);
	}
}

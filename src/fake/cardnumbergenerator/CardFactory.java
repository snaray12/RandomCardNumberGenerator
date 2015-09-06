package fake.cardnumbergenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class CardFactory {
	
	public static Card getCard(String type){
		Card card = null;
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("config/CardGeneratorClassMap")));
			String cls = props.getProperty(type);
			Class c = Class.forName(cls);
			card = (Card)c.newInstance();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return card;
	}
}

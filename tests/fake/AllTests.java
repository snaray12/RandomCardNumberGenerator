package fake;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestVisaCard.class, TestMasterCard.class})
public class AllTests {

}

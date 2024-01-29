import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */

@Suite
@SelectClasses({ CarTest1.class, CarTest2.class})
public class AllTests {

}

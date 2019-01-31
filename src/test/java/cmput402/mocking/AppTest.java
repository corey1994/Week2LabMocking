package cmput402.mocking;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import stub.CityStub;
import stub.SalaryStub;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testCapitalizeName() {
    	assert("Abram Hindle"
    			.equals(Main.capitalizeName("abram hindle")));
    }
    
    public void testFilterEdmonton() {
    	Util util = new Util();
    	CityStub stub = new CityStub();
    	assert(3 == util.filterEdmonton(stub));
    }
    
    public void testFilterHighSalaries() {
    	Util util = new Util();
    	SalaryStub stub = new SalaryStub();
    	assert(3 == util.filterHighSalaries(stub));
    }
}

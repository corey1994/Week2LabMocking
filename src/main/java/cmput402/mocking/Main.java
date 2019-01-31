package cmput402.mocking;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Address address1= new Address("University of Alberta", "Edmonton");
    	Employee employee1= new Employee("Shaiful Chowdhury", 1, 20000, address1);
    
    	Address address2= new Address("University of Waterloo", "Waterloo");
    	Employee employee2= new Employee("Sarah Nadi", 2, 90000, address2);
    	
    	Address address3= new Address("University of Victoria", "Victoria");
    	Employee employee3= new Employee("Abram hindle", 2, 70000, address3);
    }
    
    public static String capitalizeName(String name) {
    	String capName = "";
    	String[] tmpString;
    	tmpString = name.split(" ");
    	capName = tmpString[0].substring(0, 1).toUpperCase() 
    			  + tmpString[0].substring(1);
    	capName += " " + tmpString[1].substring(0, 1).toUpperCase() 
    			   + tmpString[1].substring(1);
    	return capName;
    }
}

package quicktest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BusinessService service = new BusinessService();
        System.out.println(service.testString());
        System.out.println( "Hello World!" );
    }
}

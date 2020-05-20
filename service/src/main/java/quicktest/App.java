package main.java.quicktest;

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

        System.out.println(service.orderlyQueue("accb", 1));
        System.out.println(service.testQueue1());



    }
}

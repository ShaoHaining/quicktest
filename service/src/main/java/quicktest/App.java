package main.java.quicktest;

import sun.util.resources.ga.LocaleNames_ga;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Long beginTime = System.currentTimeMillis();
        BusinessService service = new BusinessService();
        System.out.println(service.testString());
        System.out.println( "Hello World!" );

        System.out.println(service.orderlyQueue("accb", 1));
        System.out.println(service.testQueue1());


        System.out.println(System.currentTimeMillis());
        Map<String,String> entryMap = new HashMap<>();
        entryMap = System.getenv();
        System.out.println(entryMap.get("MOZ_PLUGIN_PATH"));
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime-beginTime);

        String[] words = "Today is Sunday, I will stay at home.".split(" ");
        Collection<String> wList = new LinkedList<>();
        Collections.addAll(wList, words);
        System.out.println(wList);


        for (Map.Entry entry: System.getenv().entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("===================");

        Map<String, String> mapDemo = new HashMap<>();
        mapDemo.put("zhouyi", "Mon");
        mapDemo.put("zhouer", "Tus");
        mapDemo.put("zhousan", "Thus");

        for (Map.Entry entry: mapDemo.entrySet()){
            System.out.println(entry.getValue());
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");




    }
}

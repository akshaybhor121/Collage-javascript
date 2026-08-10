// Practical No 2 : Write a program to insert ,retrive and remove the record using tree set

import java.util.Iterator;
import java.util.TreeSet;

public class practical2
 {
    public static void main(String[] args)
    {
        TreeSet<String> city = new TreeSet<>();

        //add() method

        city.add("Pune");
        city.add("Mumbai");
        city.add("Nashik");
        city.add("Nagpur");
        city.add("Thane");

           System.out.println("TreeSet : "+city);

        //Itrator method:
        System.out.println("Itrating using Itrator:");
        Iterator<String> it = city.iterator();
        while (it.hasNext())
             {
                System.out.println(it.next());
             }

        System.out.println("Size :"+city.size());

        //contains() method

        System.out.println("City present in Treeset :"+city.contains("Nashik"));

        //remove() method

        city.remove("Nagpur");
    
        System.out.println("Treeset After Removing Element : "+city);

        System.out.println("Size after Removing :"+city.size());
    }
    
}

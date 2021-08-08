package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample2 {
    public static void main(String[] args) {


        //id,Person
        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ",23));
        map.put(null, new Person("",0));         //HashMap allows null key
        map.put(12,new Person("Nick", 10));

        System.out.println(map.get(31));
        System.out.println("null = " + map.get(null));
        System.out.println(map.get(32));
        System.out.println(map);


        System.out.println("-----------LINKED HASH MAP--------------------------");

        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32, new Person("MJ",23));
        map2.put(null, new Person("",0));
        map2.put(12,new Person("Nick", 10));
        System.out.println(map2);

        System.out.println("------------TREE MAP-------------------------");

        Map<Integer, Person> map3 = new TreeMap<>();
        map3.put(32, new Person("MJ",23));
        map3.put(0, new Person("",0));
        map3.put(12,new Person("Nick", 10));
        System.out.println(map3);

    }
}

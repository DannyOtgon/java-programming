package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add(("john"));
        list.add(("jamie"));
        list.add(("jorege"));
        System.out.println("list = " + list);

        Iterator<String> it = list.iterator();
        it.next();
        it.remove();
        System.out.println("list = " + list);
        System.out.println("it.next() = " + it.next());

        Set<String> names = new HashSet<>();
        names.add("lebron");
        names.add("james");
        names.add("mj");
        names.add("kobe");
        names.add("tim");
        names.add("wade");
        names.add("messi");
        System.out.println("==================================");
        System.out.println(names);
        names.remove("lebron");
        System.out.println(names + " lebron remove");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length()<3){
                iterator.remove();

            }
        }
        System.out.println("After Remove: " + names);

    }
}

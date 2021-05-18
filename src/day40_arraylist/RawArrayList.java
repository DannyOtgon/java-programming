package day40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        //Interview Question: What is the default capacity of empty ArrayList = 10!

        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        System.out.println(list1);
        System.out.println(list1.size());

    }
}

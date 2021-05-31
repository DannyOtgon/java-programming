package day48_constructor_static;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {


        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        System.out.println("_________________________________________________");

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John", 248);
        System.out.println(cs2);
        System.out.println(cs3);
        System.out.println(cs3.getName());
        System.out.println(cs2.getId());

        //array of Customer
        Customer [] todaysCustomer = {cs1, cs2, cs3, new Customer("Jordan",45)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Kobe",8));
        customerList.add(new Customer("Rose",1));

        System.out.println("__________________________________________");
        System.out.println(Arrays.toString(todaysCustomer));
        System.out.println(customerList.get(0));
        System.out.println(customerList);
        System.out.println("----------------------FOR LOOP--------------------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("--------------------FOR EACH LOOP--------------------");
        for (Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);

        }

        //print only the names
        System.out.println("------------------ONLY NAMES-------------------");
        for (Customer each : customerList) {
            System.out.print(each.getName()+" ");
        }
        //do it again, print names only but using LAMBDA expression
        customerList.forEach(each-> System.out.println("\n"+each.getName()));




        }
    }


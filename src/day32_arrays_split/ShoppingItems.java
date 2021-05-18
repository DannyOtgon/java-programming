package day32_arrays_split;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ShoppingItems {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("--------------FIND THE INDEX OF 'Gloves' in items array ----------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;

                //System.out.println((i + "-"+items[i]));
            }
        }
        System.out.println("----------Set boolean to true if first 'Ipad' is found");
        boolean ipadExists = false;

        for (int i =0; i<items.length; i++) {
        if (items[i].equals("iPad")){
            ipadExists=true;
            System.out.println("Ipadexists? "+ ipadExists);


            break;

        }
        }
        System.out.println("----Print a report of each shopping item------");
        for (int i=0; i<items.length;i++){
            System.out.println("item name: "+items[i]+" Price: $"+prices[i]+" ID# "+itemIDs[i]);
        }

        System.out.println("----Look for 'Jacket' in items and print all details");
        for (int i=0; i<items.length;i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println("item name: "+items[i]+" Price: $"+prices[i]+" ID# "+itemIDs[i]);
                break;
            }
        }

        }

    }


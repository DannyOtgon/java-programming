package day48_constructor_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("CyberBugs");
        //print size of members
        System.out.println(group1.getMembers().size());

        //add members one by one
        group1.addMember("John");
        group1.addMember("Jack");
        group1.addMember("Mike");
        group1.addMember("Kevin");
        group1.addMember("Chris");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Klay", "Draymond", "Shaun"));
        System.out.println(group2.toString());
        System.out.println("group2 members: " + group2.getMembers());

        //check to see if klay is in group2
        if(group2.getMembers().contains("Klay")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //remove some members from group1 (Group2 is immutable so you can't remove because its List )
        group1.removeMember("John");
        group1.removeMember("Jack");
        System.out.println("group1 updated: " + group1);


    }
}

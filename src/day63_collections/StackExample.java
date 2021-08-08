package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //LIFO

        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Hercules");
        bookStack.add("Leaders eat last");
        bookStack.push("Last Dance");
        //bookStack.pop();                               //pop method removes & returns the top of the stack item

        System.out.println(bookStack);


    }
}

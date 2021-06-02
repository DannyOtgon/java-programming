package day49_static;

public class StaticTest {
     String word = "java";
    public static void main(String[] args) {

        //Static Method can be called using classname.
        StaticMethods.displayMessage("calling by classname.static object name");

        //instance method needs an object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();


        StaticTest test1 = new StaticTest();
        System.out.println(test1.word);


    }
}

package day49_static;

public class StaticMethods {

    int num = 10;
    static int count =5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
        //System.out.println("num = " + num);      -->num is error because you can't call instance variable into static method
        System.out.println("count = " + count);
    }
    public static void anotherStaticMethod(){
        System.out.println(("another static method"));
        displayMessage("calling other static method");
    }
    public void instanceMethod(){
        System.out.println("instance method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("display message Static method");
    }
}

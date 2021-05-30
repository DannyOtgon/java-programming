package day47_constructors;

public class Student {


    //No_args constructor
    public Student(){
        System.out.println("Student instance with no Args");
    }

    //constructor with 1 param
    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

    public Student (int age){
        System.out.println("age param constructor | age = " + age);
    }

    public Student (String name, int Age){
        System.out.println("Student name & age: " + name + "-" +Age);

    }
}

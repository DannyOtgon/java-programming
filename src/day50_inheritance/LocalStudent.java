package day50_inheritance;

public class LocalStudent extends Student{
    String schoolType;
    public void profession(String profession){
        System.out.println(name + " is studying " + profession + " at "+ school + schoolType);
    }
}

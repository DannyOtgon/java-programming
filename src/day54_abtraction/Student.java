package day54_abtraction;

public abstract class Student {
    public void code (String language){
        System.out.println("Student is coding using + " + language);
    }

    public abstract void attendClass();

}

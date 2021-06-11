package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jack";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        System.out.println("=======================================================");

        Teacher t1= new Teacher();
        t1.name = "Mudoril";
        t1.age = 40;
        t1.talk();
        t1.work("teacher");
        t1.teach("Programming");

        System.out.println("--------------------------------------------------------");

        Student student = new Student ();
        student.name = "Sasha";
        student.age = 21;
        student.school = "cybertek school";
        student.study("cyber security");
        student.walk();
        student.talk();

        System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");

        LocalStudent localStudent = new LocalStudent();
        localStudent.name = "JohnnyBoy";
        localStudent.schoolType = "at home";
        localStudent.school = "UMD";
        localStudent.profession("hacker");



    }

}

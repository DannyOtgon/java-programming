package day61_exceptions_collections;

public class ElementaryStudentTest {

    //to insert (shortcut) TRY CATCH 1. HIGHLIGHT 2. GO TO CODE 3.SURROUND WITH->

    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //print error stack trace and continue. does not stop code
        }
        System.out.println("--- EXECUTION COMPLETED ---");

    }


}


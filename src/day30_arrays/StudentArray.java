package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String [] student1 = {"1234", "Danny", "Otgon", "B22", "8001237777"};
        System.out.println("id: "+ student1[0]);
        System.out.println("first name: "+ student1[1]);
        System.out.println("last name: "+ student1[2]);
        System.out.println("batch# : "+ student1[3]);
        System.out.println("phone# : "+ student1[4]);

        System.out.println("student data length: "+ student1.length);

        if (student1.length == 5){
            System.out.println("pass: data array has correct length");
        }else{
            System.out.println("Fail: data array length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        student1[1] = student1[1].toLowerCase();
        System.out.println(student1[1]);
        System.out.println(student1[0].charAt(1));

        for (int i=0; i<student1[1].length();i++)
            System.out.print("\t"+student1[1].charAt(i));

        String mobileNum = student1[4];
        System.out.println("\n"+mobileNum.length());
        System.out.println(mobileNum);
        System.out.println(mobileNum.startsWith("800"));
        System.out.println(mobileNum.contains("8"));

        System.out.println("=======================================================");

        for (String each : student1){
            System.out.println(each);
        }


    }
}

package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("inTel"));

        System.out.println(word.endsWith("idea"));

        /**
         * Mr.
         * Dr.
         * Mrs.
         */

        String firstName = "Mr.Ken";
        if(firstName.startsWith("Mr")){
            System.out.println("man");
        }else if (firstName.startsWith("Dr")){
            System.out.println("doctor");
        }else if (firstName.startsWith("Mrs")){
            System.out.println("Married Woman");
        }else if (firstName.startsWith("Ms")){
            System.out.println("Single woman");
        }

    }
}

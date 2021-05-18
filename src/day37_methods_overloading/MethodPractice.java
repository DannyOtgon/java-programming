package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("java", 3, '|');
        System.out.println(repeatStringV2("python",5,'|'));

    }

    public static void repeatString(String word, int times, char delimiter) {
        for (int i = 0; i < times; i++)
            System.out.print(word + " " + delimiter + " ");
        System.out.println();
    }

    public static String repeatStringV2(String word, int times, char delimiter) {
        String retValue = "";
        for (int i = 0; i < times; i++) {
            retValue += word + delimiter;
        }
        return retValue;
}
}

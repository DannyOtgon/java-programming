package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count: 12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex));
        //now we can combine index & substring into one statement

        System.out.println(result.substring(result.indexOf("l")));

        String today = "I learned [Python] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}

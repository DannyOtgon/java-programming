package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(10));

        for (int i=1; i<=8; i++){
            System.out.println("day"+i+"= "+getDayName(i));

            //Store getDayName into variable, and print variable
            String today = getDayName(6);
            System.out.println("\ntoday =" + today);
            String someDay = getDayName(0);
            if (someDay == null){
                System.out.println("someday is null for invalid Day");
            }

        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7 : return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }
    }
}

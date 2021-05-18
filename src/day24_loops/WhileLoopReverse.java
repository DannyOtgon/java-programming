package day24_loops;

import static javafx.scene.input.KeyCode.U;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >=0){
            System.out.println("count = " + count);
            count --;
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;
        /**
         * read each message 1 by 1 until you have 0 unread
         */
        while (unreadSMS>=0){
            System.out.println("total unread SMS: "+unreadSMS-- + "\uD83D\uDC8C");
        }
        System.out.println("No more unread SMS messages");
    }
}

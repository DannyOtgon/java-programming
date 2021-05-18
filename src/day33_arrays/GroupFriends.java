package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        String friends = "Jack, G, K, John,";
        String [] eachFriend = friends.split(",");
        for (String each : eachFriend)
            System.out.println(each);
    }
}

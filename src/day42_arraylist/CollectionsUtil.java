package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters,'a'));

        int vCount = Collections.frequency(letters,'v');
        System.out.println(vCount);

        System.out.println("max char = " + Collections.max(letters));
        System.out.println("min char = " + Collections.min(letters));

        Collections.replaceAll(letters,'a','u');
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(23,1,45,234,70,0,-8,2,2,2,2);
        System.out.println("before sort = " + nums);
        Collections.sort(nums);
        System.out.println("after sort = " + nums);

        System.out.println(Collections.frequency(nums,2));

        Collections.replaceAll(nums,2,99);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println(nums);

    }
}

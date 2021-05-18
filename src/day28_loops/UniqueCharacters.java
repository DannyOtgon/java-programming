package day28_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word = "MmMmongolia";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(word.charAt(i)+ "")) {
                unique += word.charAt(i);
            }
        }
        System.out.print(unique);
    }
}


package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println(word.replace('u','A').replace('i','A'));

        System.out.println(word);
        word = word.replace("hub","lab");
        System.out.println(word);

        String sentence = "Java is fun";
        sentence = sentence.replace(" ","");
        System.out.println(sentence);

        sentence = sentence.replace("Java","selenium").replace("fun","alotoffun");
        System.out.println(sentence);

        String result = "1-48 of over 4000 results for java book";
        result = result.replace("1-48 of over","").replace("results for java book","");
        System.out.println(result);




    }

}

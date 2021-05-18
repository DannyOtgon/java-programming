package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] a = sentence.split(" ");
        String reverse = "";
        for (int i=a.length -1; i>=0; i--){
            reverse+=a[i]+" ";
        }
        System.out.println(reverse.trim());
    }
}

package day10_shorthand_operators;

public class IncrementDecrementoperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = "+ i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        i++;
        i++;
        i++;
        i++;
        System.out.println("i = " + i);

        //4 different ways of adding +1
        int linesOfCode = 15;
        linesOfCode = linesOfCode +1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        //4 different ways of decreasing by -1
        linesOfCode = linesOfCode -1;
        linesOfCode-=1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

       }
}

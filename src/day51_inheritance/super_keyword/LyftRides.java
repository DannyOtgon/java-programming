package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {

        Lyft lyft = new Lyft();
        LyftXL lyftXL = new LyftXL();
        Lux lux = new Lux();

        System.out.println("lyft.calculateRate(5) = " + lyft.calculateRate(5));
        System.out.println("lyftXL.calculateRate(5) = " + lyftXL.calculateRate(5));
        System.out.println("lux.calculateRate(5) = " + lux.calculateRate(5));



    }
}

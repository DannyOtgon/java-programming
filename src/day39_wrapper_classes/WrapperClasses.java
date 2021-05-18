package day39_wrapper_classes;
/**
 * What is Wrapper Class? --> Classes that help convert primitive into object.
 * What is the difference b/w Auto-boxing and Un-boxing?
 * AUTO-BOXING: converting from primitive to wrapper class object.
 * UN-BOXING: converting from wrapper class object to a primitive.
 */

public class WrapperClasses {
    public static void main(String[] args) {
        int num =100;
        System.out.println(num / 50);

        Integer n2 = 100;
        System.out.println(n2 / 50);

        Byte b1 = new Byte((byte) 5);
        Byte b2 = 10;
        Short sh1 = new Short ((short) 40);
        Short sh2 = 50;
        Integer i1 = new Integer (100);
        Integer i2 = 200;
        Long l1 = new Long (300L);
        Long l2 = 3455L;
        Float fl1 = new Float (5.2F);
        Float fl2 = 45.3F;
        Double d1 = new Double (345.3);
        Double d2 = 234.5;
        Character ch1 = new Character ('Q');
        Character ch2 = 'V';
        Boolean bl1 = new Boolean (true);
        Boolean bl2 = false;






    }
}

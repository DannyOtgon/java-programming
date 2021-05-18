package day24_loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'z';

        while(letter >= 'a') {
            System.out.print(letter-- + " ");
        }
        System.out.println("\nAlphabet");
        }
}

package day00_Practicing;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Locale;

public class StringPrintPractice {
    public static void main(String[] args) {


        String country = "america";
        System.out.println(country.substring(0,1).toUpperCase(Locale.ROOT) + country.substring(1,7));



    }
}

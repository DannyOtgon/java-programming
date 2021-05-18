package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("indexOfCss = " + indexOfCss);

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("idxOfCucumber = " + idxOfCucumber);

        if (technologies.contains ("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven")>=0){
            System.out.println("maven is present!");
        }else{
            System.out.println("maven is not present!");
        }

    }
}

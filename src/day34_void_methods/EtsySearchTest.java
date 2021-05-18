package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-----Starting etsy search smoke test-----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }
    public static void openBrowser(){
        System.out.println("open google chrome");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Enter https:etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Enter wooden spoon in search bar & click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Scroll down to see results");
    }
}

package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";


    //constructor method
    public Address(){
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Java";
        state = "Unknown";
        zipCode = "00000";
    }

    //second constructor, overloaded constructor -> provides shortcut to initialize variables
    public Address(String street, String city, String state, String zipCode){
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }



    @Override
    public String toString() {
        return "Address: " +
                " " + street +
                " " + city +
                " " + state +
                " " + zipCode;
    }

    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Kobe";
        employee1.jobTitle = "Shooting Guard";

        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        employee1.behavior();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Employee employee2 = new Employee();
        employee2.name = "Westbrook";
        employee2.jobTitle = "Point guard";
        System.out.println(employee2.name);
        System.out.println(employee2.jobTitle);
        employee2.behavior();
    }
}

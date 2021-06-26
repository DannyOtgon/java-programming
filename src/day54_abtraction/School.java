package day54_abtraction;

public class School {
    public static void main(String[] args) {
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
    }
}

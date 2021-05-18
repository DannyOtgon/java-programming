package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char studentGrade = 'A';
        if (studentGrade == 'A' || studentGrade ==  'B' || studentGrade== 'C'){
            System.out.println("You passed with " + studentGrade);
        }else if (studentGrade == 'D'){
            System.out.println("Qualify for retake. Grade - " + studentGrade);
        }else if (studentGrade == 'E'){
            System.out.println("Fail. Grade - " + studentGrade);
        }else{
            System.out.println("Invalid studentGrade - " + studentGrade);
        }

    }
}

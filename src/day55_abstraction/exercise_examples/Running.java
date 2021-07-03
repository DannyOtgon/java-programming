package day55_abstraction.exercise_examples;

public class Running extends Exercise {


    @Override
    public void perform() {
        System.out.println("Performing Running Exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return 13 * minutes;
    }
}

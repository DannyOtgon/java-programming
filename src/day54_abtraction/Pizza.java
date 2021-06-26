package day54_abtraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Roll the dough and put toppings");
    }

    @Override
    public void serve() {
        System.out.println("Cut into 8 pieces and serve in a box");
    }
}

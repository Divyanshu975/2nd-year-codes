import java.util.*;

interface Motor{
    int capacity=220;
    void run();
    void consume();
}
class washingmachine implements Motor{
    public void run(){
        System.out.println("THe washing machine is running");
    }
    public void consume(){
        System.out.println("The washing machine is consuming power");
    }
}
public class q1{
    public static void main(String[] args) {
        washingmachine w1=new washingmachine();
        w1.run();
        w1.consume();
        System.out.println("The value of capacity variable is: "+ w1.capacity);
    }
}

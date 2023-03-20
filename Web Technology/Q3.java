import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        kiitian k1=new kiitian(21051905, 123457);
        k1.course();
    }
}

abstract class student{
    int rollno;
    int regno;
    abstract void course();
}

class kiitian extends student{
    kiitian(int a, int b){
        rollno=a;
        regno=b;
    }
    void course(){
        System.out.println("Roll Number: "+rollno+"\nRegistration Number:"+regno);
    }
}

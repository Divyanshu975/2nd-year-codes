import java.util.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the length breadth and height of the 3d box:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        threeD obj1= new threeD(a,b,c);
        obj1.sheetPrice3D();
    }
}

class twoD{
    int length;
    int breadth;
    int price;
    twoD(int a,int b){
        this.length=a;
        this.breadth=b;
    }
    void sheetPrice2D(){
        price=40*length*breadth;
        System.out.println("The price of 2D sheet is "+price);
    }
}

class threeD extends twoD{
    int height;
    threeD(int a, int b, int c){
        super(a,b);
        this.height=c;
    }
    void sheetPrice3D(){
        price=60*length*breadth*height;
        System.out.println("The price of the specified 3D box is "+price);
    }
}
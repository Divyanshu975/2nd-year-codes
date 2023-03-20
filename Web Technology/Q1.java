import wt_lab_08.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Number n1=new Number();
        n1.read();
        n1.display();
        n1.swap();
        n1.display();
    }
}

class Number{
    int n;
    int [] arr;
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers you wnat to input:");
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void swap(){
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(arr[max]<arr[i])
                max=i;
            if(arr[min]>arr[i])
                min=i;
        }
        int temp=arr[max];
        arr[max]=arr[min];
        arr[min]=temp;
    }
    void display(){
        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    }


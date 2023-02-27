import java.util.*;
class Account{
    int accNo;
    int balance;
    Scanner sc=new Scanner(System.in);
    Account(){
        System.out.println("Enter account number and balance");
        accNo=sc.nextInt();
        balance=sc.nextInt();
    }
    void disp(){
        System.out.println("Account Number : "+accNo);
        System.out.println("Balance : "+balance);
    }
}
class Person extends Account{
    int aadharNo;
    String name;
    Person(){
        System.out.println("Enter your Aadhaar number and Name:");
        aadharNo=sc.nextInt();
        sc.skip("\\R?");  //used to skip newline characer from being taken as input by nextLine() function
        name=sc.nextLine();
    }
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("Aadhar Number : "+aadharNo);
        System.out.println("Account Number : "+accNo);
        System.out.println("Balance : "+balance);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person []p1=new Person[5];
        for(int i=0;i<5;i++){
            p1[i]=new Person();
        }
        p1[0].disp();
        p1[1].disp();
    }
}

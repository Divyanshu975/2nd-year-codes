public class q2 {
    public static void main(String[] args) {
        String s1,s2;
        int a;
        s1="Java";
        s2="C++";
        System.out.println("String is "+s1);
        s1=s1.toUpperCase();
        System.out.println("String in uppercase is "+s1);
        s1=s1.toLowerCase();
        System.out.println("String in lowercase is "+s1);
        StringBuffer sb=new StringBuffer("Java");
        sb.reverse();
        System.out.println("Reversed String is "+sb);
        if(s1==s2){
            System.out.println(s1+" is equal to "+s2);
        }
        else{
            System.out.println(s1+" is not equal to "+s2);
        }
        sb.reverse();
        sb.append(s2, 0, 3);
        System.out.println("The appended string is "+sb);
        
    }    
}

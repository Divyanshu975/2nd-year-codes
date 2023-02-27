class Base{
    int a, b;
    Base(int x, int y){
        a=x;
        b=y;
    }
}

class Derived extends Base{
    int c;
    Derived(int x, int y,int z){
        super(x,y);
        c=z;
    }
    void disp(){
        System.out.println("a="+a+"\nb="+b+"\nc="+c);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Derived d1=new Derived(4,5,6);
        d1.disp();
    }
}

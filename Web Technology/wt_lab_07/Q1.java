class plate{
    int length,breadth;
    plate(int l,int b){
        length=l;
        breadth=b;
        // System.out.print("length is "+l+"breadth"+b);
    }
}

class box extends plate{
    int height;
    box(int l, int b, int h){
        super(l,b);
        height=h;
        // System.out.print(" height is"+h);
    }
}

class woodbox extends box{
    int thick;
    woodbox(int l,int b,int h,int t){
        super(l,b,h);
        thick=t;
        // System.out.print(" and thickness is "+t );
    }
}

public class Q1 {
    public static void main(String[] args) {
        woodbox w1=new woodbox(4, 5, 6, 7);
        System.out.println("length is "+w1.length);
        System.out.println("breadth is "+w1.breadth);
        System.out.println("height is "+w1.height);
        System.out.println("thickness is "+w1.thick);
    }
}

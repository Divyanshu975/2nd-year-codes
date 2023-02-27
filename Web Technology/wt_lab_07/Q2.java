class shape{
    double area;
    void showArea(){

    }
}
class rectangle extends shape{
    int length,breadth;
    rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    void showArea(){
        area=length*breadth;
        System.out.println("Area of rectangle is "+area);
    }
}

class circle extends shape{
    int radius;
    circle(int r){
        radius=r;
    }
    void showArea(){
        area=3.14*radius*radius;
        System.out.println("Area of circle is "+area);
    }
}

public class Q2 {
    public static void main(String[] args) {
        rectangle r1=new rectangle(4,5);
        circle c1=new circle(4);
        r1.showArea();
        c1.showArea();
    }
}

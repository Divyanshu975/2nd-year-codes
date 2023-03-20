package wt_lab_08.marketing;
import wt_lab_08.general.*;
public class sales extends employee{    
    float tal;
    public sales(int a,String b, float c){
        super(a, b);
        this.base=c;
    }
    void tallowance(){
        tal=0.05f*earning;
    }
    public void display(){
        System.out.println("EMPID:"+this.empid+"\nTotal earning:"+this.earning);
    }
    public static void main(String[] args) {
        sales s1=new sales(21051905,"Divyanshu",5000);
        s1.earnings();
        s1.display();
    }

}

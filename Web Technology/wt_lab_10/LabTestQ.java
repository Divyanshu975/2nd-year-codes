class rational {
    int numerator,denominator;
    rational(int a, int b){
        this.numerator=a;
        this.denominator=b;
    }
    rational add(rational a){
        int ans_num,ans_den;
        int lcm=1;
        for(int i=1;i<this.denominator*a.denominator;i++){
            if(i*this.denominator%a.denominator==0){
                lcm=i*this.denominator;
                break;
            }
        }
        ans_num=(this.numerator*(lcm/this.denominator))+(a.numerator*(lcm/a.denominator));
        ans_den=lcm;
        rational ans=new rational(ans_num,ans_den);
        return ans;
    }
    void show(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
}

public class LabTestQ{
    public static void main(String[] args) {
        rational r1=new rational(5, 6);
        rational r2=new rational(3, 9);
        r1.show();
        r2.show();
        rational r3=r1.add(r2);
        r3.show();

    }
}


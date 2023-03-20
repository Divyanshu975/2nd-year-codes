package wt_lab_08.general;

public class employee {
    protected int empid;
    private String ename;
    public float base;
    public float earning;
    public employee(int a, String b){
        this.empid=a;
        this.ename=b;
    }
    public void earnings(){
        earning=base+(0.8f*base)+(0.15f*base);
    }

}

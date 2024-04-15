package Bai7;

public class HCN {
    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    private int cd;
    private int cr;

    public HCN(int a){
        setCd(a);
        setCr(a);
    }
    public HCN(int cd,int cr){
        this.cd=cd;
        this.cr=cr;
    }

    public double findArea(){
        return cd * cr;
    }
    public double findPerimeter(){
        return 2 * (cd + cr);
    }

}

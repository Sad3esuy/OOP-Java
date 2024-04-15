package Bai6;

public class PhuongTrinhBacNhat {
    private int a;
    private int b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PhuongTrinhBacNhat(){
        a=0;
        b=0;
    }
    public PhuongTrinhBacNhat(int a,int b)
    {
        setA(a);
        setB(b);
    }
    public PhuongTrinhBacNhat(PhuongTrinhBacNhat c)
    {
        setA(c.a);
        setB(c.b);
    }
    public  void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = (double)-b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }
}

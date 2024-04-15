package Bai5;

import java.math.*;
public class TamGiac {
    private int t1;
    private int t2;
    private int t3;
    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getT3() {
        return t3;
    }

    public void setT3(int t3) {
        this.t3 = t3;
    }



    public TamGiac(int t1,int t2,int t3)
    {
        setT1(t1);
        setT2(t2);
        setT3(t3);
    }

    public double ChuViTamGiac(){
        return t1+t2+t3;
    }
    public double DienTich(){
        double p  = (t1 + t2 + t3) / 2;
        return Math.sqrt(p * (p - t1) * (p - t2) * (p - t3));

    }
    public static String LoaiTamGiac(double a, double b, double c) {
        if(a<=0 || b<=0 || c<=0)
            return "Tam giac khong ton tai";
        else if (a == b && b == c) {
            return "Tam giac deu";
        } else if (a == b || b == c || a == c) {
            return "Tam giac can";
        }
        else if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
            return "Tam giac vuong";
        else {
            return "Tam giac thuong";
        }
    }

}

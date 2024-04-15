package Bai2;

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;
    //setter => Thiet lap gia tri
    //getter => Lay gia tri
    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    // Constructor có hai tham số
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if (mau != 0) {
            setMau(mau);
        } else {
            System.out.println("Mau so khong hop le!! Dat lai mau la 1");
            setMau(1);
        }
    }
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        setTu(x.nextInt());
        do{
            System.out.print("Nhap mau so: ");
            setMau(x.nextInt());
            if(getMau()==0)
                System.out.println("Mau so khong dung!! Nhap lai!!");
        }while (getMau()==0);
        if(getMau()<0)
        {
            setTu(-getTu());
            setMau(-getMau());
        }
    }
    public void output(){
        System.out.println(getTu() + "/" + getMau());
    }
    public int UCLN(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public void RutGon(){
        int ucln=UCLN(tu,mau);
        tu = tu/ucln;
        mau = mau/ucln;
    }
    public void congPhanSo(PhanSo ps) {
        int ts = getTu() * ps.getMau() + ps.getTu() * getMau();
        int ms = getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts,ms);
        phanSoTong.RutGon();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
    public void truPhanSo(PhanSo ps) {
        int ts = getTu() * ps.getMau() - ps.getTu() * getMau();
        int ms = getMau() * ps.getMau();
        if(ms<0)
        {
            ts=-ts;
            ms=-ms;
        }
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.RutGon();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.getTu()+ "/" + phanSoHieu.getMau());
    }
    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts,ms);
        phanSoTong.RutGon();
        System.out.println("Tich hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoTong = new PhanSo(ts,ms);
        phanSoTong.RutGon();
        System.out.println("Thuong hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }

}

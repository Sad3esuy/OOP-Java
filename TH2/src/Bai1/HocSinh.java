package Bai1;

import java.util.Scanner;

public class HocSinh {
    private String ma,name;
    private double dtb;
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    Scanner x = new Scanner(System.in);
    public void input(){
        System.out.print("Nhap ma Hs: ");
        setMa(x.nextLine());
        System.out.print("Nhap name: ");
        setName(x.nextLine());
        System.out.print("Nhap dtb: ");
        setDtb(x.nextDouble());
    }
    public void output(){
        System.out.println("Ma Hs: " + getMa() + "\t\tName: " + getName() + "\t\tDTB: " + getDtb());
    }



}

package Bai6;

import java.util.Scanner;

public class HinhTron implements Hinh{
    private double r;
    public HinhTron(){

    }
    public HinhTron(double r){
        this.r=r;
    }

    @Override
    public void nhap(){
        Scanner x=new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = x.nextDouble();
    }
    public void xuat(){
        System.out.print("Ban kinh: "+r+"\t\t");
    }

    @Override
    public double dientich() {
        return pi*r*r;
    }
}

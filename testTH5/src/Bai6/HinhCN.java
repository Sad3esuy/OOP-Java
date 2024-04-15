package Bai6;

import java.util.Scanner;

public class HinhCN implements Hinh{
    private double dai,rong;
    public HinhCN(){

    }
    public HinhCN(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
    public void nhap(){
        Scanner x=new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = x.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = x.nextDouble();
    }
    public void xuat(){
        System.out.print("Chieu dai: "+dai+"\t\t");
        System.out.print("Chieu rong: "+rong+"\t\t");
    }

    @Override
    public double dientich() {
        return dai*rong;
    }
}

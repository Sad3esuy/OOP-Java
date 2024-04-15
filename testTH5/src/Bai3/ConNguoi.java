package Bai3;

import java.util.Scanner;

public class ConNguoi {
    protected String name;
    protected int namsinh;

    public ConNguoi(){

    }
    public ConNguoi(String name,int namsinh){
        this.name=name;
        this.namsinh=namsinh;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = x.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = x.nextInt();
        x.nextLine();
    }
    public void output(){
        System.out.print("Ho ten: "+ name);
        System.out.print("\t\tNam sinh: "+namsinh);
    }
}



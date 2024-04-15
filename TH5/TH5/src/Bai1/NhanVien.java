package Bai1;

import java.util.Scanner;

abstract public class NhanVien {
    protected String ma,name,trinhdo;
    protected static long luongcb;
    public static long getLuongcb() {
        return luongcb;
    }

    public static void setLuongcb(long luongcb) {
        NhanVien.luongcb = luongcb;
    }

    public NhanVien(){

    }
    public NhanVien(String ma,String name,String trinhdo)
    {
        this.ma=ma;
        this.name=name;
        this.trinhdo=trinhdo;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        ma = x.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = x.nextLine();
        System.out.print("Nhap trinh do: ");
        trinhdo = x.nextLine();
    }
    public void output(){
        System.out.print("Ma nv: "+ma);
        System.out.print("\t\tTen nv: "+name);
        System.out.print("\t\tTrinh do: "+trinhdo);
    }
    abstract public long Luong();
}




package Btvn;

import java.util.Scanner;

abstract class NhanVien{
    protected String ma,name,trinhdo;
    protected int namsinh;
    protected static double luongcb=100000;

    public NhanVien(){
    }
    public NhanVien(String ma,String name,int namsinh,String trinhdo){
        this.ma=ma;
        this.name=name;
        this.trinhdo=trinhdo;
        this.namsinh=namsinh;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        ma = x.nextLine();
        System.out.print("Nhap ten nv: ");
        name = x.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = x.nextInt();
        x.nextLine();
        System.out.print("Nhap trinh do: ");
        trinhdo = x.nextLine();
    }
    public void output(){
        System.out.print("\t\tMa nv: " + ma);
        System.out.print("\t\tTen nv: " + name);
        System.out.print("\t\tNam sinh: " + namsinh);
        System.out.print("\t\tTrinh do: " + trinhdo);
    }
    public abstract double Luong();
}

abstract class NhanVienDT extends NhanVien{
    protected String truongDT,chuyenmon;
    public NhanVienDT(){

    }
    public NhanVienDT(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon){
        super(ma, name, namsinh, trinhdo);
        this.truongDT=truongDT;
        this.chuyenmon=chuyenmon;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap truong dao tao: ");
        truongDT = x.nextLine();
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = x.nextLine();
    }
    public void output(){
        super.output();
        System.out.print("\t\tTruong dao tao: " + truongDT);
        System.out.print("\t\tChuyen mon: " + chuyenmon);
    }
}
class NhanVienQuanLy extends NhanVienDT{
    protected double phucapCV;

    public NhanVienQuanLy(){

    }
    public NhanVienQuanLy(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon,double phucapCV){
        super(ma, name, namsinh, trinhdo, truongDT, chuyenmon);
        this.phucapCV=phucapCV;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap chuc vu: ");
        phucapCV = x.nextDouble();
    }
    public void output(){
        super.output();
        System.out.print("\t\tPhu cap chuc vu: "+ phucapCV);
    }
    public double Luong(){
        return (luongcb+phucapCV);
    }
}

class NhanVienNghienCuu extends NhanVienDT{
    protected double phucapDH;
    public NhanVienNghienCuu(){

    }
    public NhanVienNghienCuu(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon,double phucapDH){
        super(ma, name, namsinh, trinhdo, truongDT, chuyenmon);
        this.phucapDH=phucapDH;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap doc hai: ");
        phucapDH = x.nextDouble();
    }
    public void output(){
        super.output();
        System.out.print("\t\tPhu cap doc hai: "+ phucapDH);
    }
    public double Luong(){
        return (luongcb+phucapDH);
    }
}


package Bai1;

import java.util.Scanner;

public class NhanVienNC extends NhanVien{
    protected String chuyenmon;
    protected long phucapdh;
    public NhanVienNC(){
        super();
    }
    public NhanVienNC(String ma,String name,String trinhdo,String chuyenmon,long phucapdh){
        super(ma,name,trinhdo);
        this.chuyenmon=chuyenmon;
        this.phucapdh=phucapdh;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = x.nextLine();
        System.out.print("Nhap phu cap DH: ");
        phucapdh = x.nextLong();
    }
    public void output(){
        super.output();
        System.out.print("\t\tChuyen mon: "+chuyenmon);
        System.out.print("\t\tPhu cap DH: "+phucapdh);
    }
    public long Luong(){
        return super.getLuongcb() + phucapdh;
    }
}
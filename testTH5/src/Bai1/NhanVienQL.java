package Bai1;

import java.util.Scanner;

public class NhanVienQL extends NhanVien{
    protected String chuyenmon;
    protected long phucapcv;
    public NhanVienQL(){
        super();
    }
    public NhanVienQL(String ma,String name,String trinhdo,String chuyenmon,long phucapcv){
        super(ma,name,trinhdo);
        this.chuyenmon=chuyenmon;
        this.phucapcv=phucapcv;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = x.nextLine();
        System.out.print("Nhap phu cap CV: ");
        phucapcv = x.nextLong();
    }
    public void output(){
        super.output();
        System.out.print("\t\tChuyen mon: "+chuyenmon);
        System.out.print("\t\tPhu cap CV: "+phucapcv);
    }
    public long Luong(){
        return super.getLuongcb() + phucapcv;
    }
}

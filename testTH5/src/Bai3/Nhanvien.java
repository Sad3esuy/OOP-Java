package Bai3;

import java.util.Scanner;

abstract public class Nhanvien extends ConNguoi{
    public static long getLuong() {
        return luong;
    }

    public static void setLuong(long luong) {
        Nhanvien.luong = luong;
    }

    protected static long luong=100000;


    protected String ngaynhanviec;
    protected PhongBanKhoa pbk = new PhongBanKhoa();

    public Nhanvien() {
        super();
    }
    public Nhanvien(String name, int namsinh, long luong, String ngaynhanviec) {
        super(name,namsinh);
        this.luong=luong;
        this.ngaynhanviec=ngaynhanviec;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ngay nhan viec: ");
        ngaynhanviec=x.nextLine();
        pbk.inputpbk();
    }
    public void output() {
        super.output();
        System.out.print("\t\tNgay nhan viec: " + ngaynhanviec);
        pbk.outputpbk();
    }
    abstract public long Luong();
}

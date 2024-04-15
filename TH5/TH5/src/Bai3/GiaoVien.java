package Bai3;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLC{
    protected long thulaoGD;

    public GiaoVien() {
        super();
    }
    public GiaoVien(String name, int namsinh, long luong, String ngaynhanviec, String trinhdo, String nganh, String noidt,long thulaoGD) {
        super(name, namsinh, luong, ngaynhanviec, trinhdo, nganh, noidt);
        this.thulaoGD=thulaoGD;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap thu lao GD: ");
        thulaoGD=x.nextLong();
    }
    public void output() {
        super.output();
        System.out.print("\t\tThu lao GD: " + thulaoGD);
        System.out.print("\t\tLuong: "+Luong());
    }
    public long Luong() {
        return getLuong() + thulaoGD;
    }
}


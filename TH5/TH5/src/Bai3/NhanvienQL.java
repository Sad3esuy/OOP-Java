package Bai3;

import java.util.Scanner;

public class NhanvienQL extends NhanVienCLC{
    protected long phucapCV;

    public NhanvienQL() {
        super();
    }
    public NhanvienQL(String name, int namsinh, long luong, String ngaynhanviec, String trinhdo, String nganh, String noidt,long phucapCV) {
        super(name,namsinh,luong,ngaynhanviec,trinhdo,nganh,noidt);
        this.phucapCV=phucapCV;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap CV: ");
        phucapCV=x.nextLong();
    }
    public void output() {
        super.output();
        System.out.print("\t\tPhu cap CV: " + phucapCV);
        System.out.print("\t\tLuong: "+ Luong());
    }
    public long Luong() {
        return getLuong() + phucapCV;
    }
}


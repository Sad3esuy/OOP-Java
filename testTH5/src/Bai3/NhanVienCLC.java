package Bai3;

import java.util.Scanner;

abstract public class NhanVienCLC extends Nhanvien{

    protected String trinhdo;
    protected String nganh;
    protected String noidaotao;

    public NhanVienCLC() {
        super();
    }
    public NhanVienCLC(String name, int namsinh, long luong, String ngaynhanviec, String trinhdo, String nganh, String noidt) {
        super(name,namsinh,luong,ngaynhanviec);
        this.trinhdo=trinhdo;
        this.nganh=nganh;
        this.noidaotao=noidt;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap trinh do: ");
        trinhdo=x.nextLine();
        System.out.print("Nhap nganh: ");
        nganh=x.nextLine();
        System.out.print("Nhap noi dao tao: ");
        noidaotao=x.nextLine();
    }
    public void output() {
        super.output();
        System.out.println("\t\tTrinh do: " + trinhdo);
        System.out.println("\t\tNganh: " + nganh);
        System.out.println("\t\tNoi dao tao: " + noidaotao);
    }

}
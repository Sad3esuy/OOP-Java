package Bai3;

import java.util.Scanner;

public class Hocvien extends ConNguoi{
    protected long diem1,diem2,diem3;

    public Hocvien() {
        super();
    }
    public Hocvien(String name, int namsinh, long diem1, long diem2, long diem3) {
        super(name, namsinh);
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }
    public void input() {
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap diem 1: ");
        diem1=x.nextLong();
        System.out.print("Nhap diem 2: ");
        diem2=x.nextLong();
        System.out.print("Nhap diem 3: ");
        diem3=x.nextLong();
    }
    public void output() {
        super.output();
        System.out.print("\t\tDiem 1: " + diem1);
        System.out.print("\t\tDiem 2: " + diem2);
        System.out.print("\t\tDiem 3: " + diem3);
    }
}

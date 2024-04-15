package Bai3;

import java.util.Scanner;

public class PhongBanKhoa {
    protected String maPBK;
    protected String tenPBK;
    public PhongBanKhoa() {

    }
    public PhongBanKhoa(String maPBK, String tenPBK) {
        this.maPBK=maPBK;
        this.tenPBK=tenPBK;
    }
    public void inputpbk() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma phong ban khoa: ");
        maPBK=x.nextLine();
        System.out.print("Nhap ten phong ban khoa: ");
        tenPBK=x.nextLine();
    }
    public void outputpbk() {
        System.out.print("\t\tMa phong ban khoa: " + maPBK);
        System.out.print("\t\tTen phong ban khoa: " + tenPBK);
    }
}
package Bai2;

import java.awt.print.PrinterJob;

public class demo {
    public static void main(String[] args) {
        System.out.println("Xuat cac phuong thuc khoi tao:");
        PhanSo myPs1 = new PhanSo();
        myPs1.output();
        PhanSo myPs2 = new PhanSo(1,2);
        myPs2.output();

        System.out.println("Nhap phan so: ");
        PhanSo myPs3 = new PhanSo();
        myPs3.input();
        myPs3.output();
        myPs1.congPhanSo(myPs3);
        myPs3.truPhanSo(myPs2);
        myPs1.nhanPhanSo(myPs2);
        myPs3.chiaPhanSo(myPs2);
    }
}

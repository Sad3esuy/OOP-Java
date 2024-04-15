package Bai4;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        NhanVien myNv1 = new NhanVien();
        myNv1.output();

        NhanVien myNv2 = new NhanVien("234","nguyen quan tuan",2);
        myNv2.output();

        NhanVien myNv3 = new NhanVien(myNv2);
        myNv3.output();

        NhanVien myNv4 = new NhanVien();
        myNv4.input();
        myNv4.output();
        myNv4.changeName();
        myNv4.output();

        double max = myNv1.getHesoLuong();
        NhanVien nvt = new NhanVien();
        if(myNv2.getHesoLuong()>max){
            max=myNv2.getHesoLuong();
            nvt=myNv2;
        }
        if(myNv4.getHesoLuong()>max)
        {
            max=myNv4.getHesoLuong();
            nvt=myNv4;
        }
        System.out.println("Nhan vien co he so luong cao nhat: ");
        nvt.output();

        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong Hs: ");
        int n = x.nextInt();
        NhanVien a[] = new NhanVien[n];
        // Khởi tạo mỗi phần tử của mảng
        for(int i=0;i<a.length;i++)
        {
            a[i]=new NhanVien();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap nhan vien " + (i+1) + ":");
            a[i].input();
        }
        for(int i=0;i<n;i++)
        {
            a[i].output();
            System.out.print("Tong luong: " + a[i].Tongluong());
            System.out.println();
        }

        NhanVien.dem();

    }

    public static void testds(String[] args) {

    }
}

package Bai6;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        byte n;
        System.out.print("Nhap so luong: ");
        n = x.nextByte();
        Hinh ds[]=new Hinh[n];
        for(int i=0;i<n;i++){
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            System.out.print("Nhap lua chon(khong nhap khac 3 loai tren!!): ");
            byte chon = x.nextByte();
            switch (chon){
                case 1:
                    ds[i]=new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i]=new HinhCN();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i]=new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai con 1 trong 3 loai tren!!");  break;
            }
        }
        for (int k=0;k<n;k++){
            ds[k].xuat();
            System.out.println("Dien tich: "+ds[k].dientich());
        }
    }
}

package Bai2;
import Bai1.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        NhanVien.setLuongcb(100000);
        byte chon,type;
        Scanner x = new Scanner(System.in);
        HocVien ds = new HocVien();
        NhanVien b;
        do{
            System.out.println("1:Them 1 nhan vien");
            System.out.println("2: Xuat theo loai nhan vien");
            System.out.println("3: Tong luong nhan vien");
            System.out.println("4: DS nhan vien");
            System.out.println("5: Tong luong nhan vien");
            System.out.println("0: Thoat");
            System.out.print("Chon chuc nang: ");
            chon = x.nextByte();
            switch (chon){
                case 1:
                    System.out.print("1:Nhan Vien QL/2:Nhan Vien NC/3:Nhan Vien PV: ");
                    type = x.nextByte();
                    if(type==1) {
                        b = new NhanVienQL();
                        b.input();
                        ds.Them1HV(b);
                    }
                    else if(type==2) {
                        b = new NhanVienNC();
                        b.input();
                        ds.Them1HV(b);
                    }
                    else if(type==3) {
                        b = new NhanVienPV();
                        b.input();
                        ds.Them1HV(b);
                    }
                    break;
                case 2:
                    System.out.print("1:Nhan Vien QL/2:Nhan Vien NC/3:Nhan Vien PV: ");
                    byte typenv = x.nextByte();
                    ds.XuatDSTheoLoai(typenv);
                    System.out.println();
                    break;
                case 3:
                    long TongLuong = ds.TinhTongLuong();
                    System.out.println("Tong luong cua tat ca nhan vien co trong hoc vien la: " + TongLuong);
                    break;
                case 4:
                    ds.XuatDS();
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    chon=0;
                    break;
            }
        }while(chon!=0);
    }
}

package Btvn;

import Btvn.NhanVienNghienCuu;
import Btvn.NhanVienQuanLy;
import Btvn.NhanVien;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        NhanVien myHv = new NhanVien("ma1","Thy",2003,"thsi");
        NhanVien myQL = new NhanVienQuanLy("ma2","Tivi",2144,"tsi","HN","Toan",12000);
        NhanVien myNC = new NhanVienNghienCuu("ma3","Xoai",5646,"thso","dsa","sfdfg",20000);
//        myHv.output();
        System.out.println();
        myQL.output();
        System.out.print("\t\tLuong: "+myQL.Luong());
        System.out.println();
        myNC.output();
        System.out.print("\t\tLuong: "+myNC.Luong());
        System.out.println();
//        byte chon,loai;
//        Scanner x = new Scanner(System.in);
//        DSNV myds = new DSNV();
//        hocvien h;
//        do {
//            System.out.println("############################################");
//            System.out.println("#\t1: Them mot nhan vien vao danh dach\t   #");
//            System.out.println("#\t2: Xuat nhan vien theo loai \t\t       #");
//            System.out.println("#\t0: Thoat\t\t                       #");
//            System.out.println("############################################");
//            System.out.print("Chon chuc nang: ");
//            chon = x.nextByte();
//            switch (chon){
//                case 1:
//                    System.out.println("1: Nhan vien quan ly <======> 2: Nhan vien nghien cuu");
//                    System.out.print("\t\tHay chon loai nhan vien: ");
//                    loai = x.nextByte();
//                    if(loai==1)
//                        h = new NhanVienQuanLy();
//                    else
//                        h = new NhanVienNghienCuu();
//                    h.input();
//                    myds.Them1nv(h);
//                    System.out.println();
//                    break;
//                case 2:
//                    System.out.print("Xuat danh sach nhan vien (1:Nv Quan ly/2:Nv Nghien cuu): ");
//                    byte loainv = x.nextByte();
//                    myds.XuatTheoLoai(loainv);
//                    System.out.println();
//                    break;
//                default:
//                    chon=0;
//                    break;
//            }
//        }while (chon!=0);
    }
}

package Bai2;
import Bai1.*;

import java.util.ArrayList;

public class HocVien {
    ArrayList<NhanVien> dsnv = new ArrayList<>();

    public void Them1HV(NhanVien h){
        dsnv.add(h);
    }
    public long TinhTongLuong() {
        long TongLuong = 0;
        for (NhanVien x : dsnv) {
            TongLuong += x.Luong();
        }
        return TongLuong;
    }
    public void XuatDS(){
        for (NhanVien x : dsnv){
            x.output();
            //System.out.print("\t\tLuong: "+x.Luong());
            System.out.println();
        }
    }
    public void XuatDSTheoLoai(byte type) {
        if (type == 1) {
            for (NhanVien x : dsnv) {
                if (x instanceof NhanVienQL) {
                    x.output();
                    System.out.print("\t\tLuong: "+x.Luong());
                    System.out.println();
                }
            }
        } else if(type==2){
            for (NhanVien x : dsnv) {
                if (x instanceof NhanVienNC) {
                    x.output();
                    System.out.print("\t\tLuong: "+x.Luong());
                    System.out.println();
                }
            }
        }else if(type==3) {
            for (NhanVien x : dsnv) {
                if (x instanceof NhanVienPV) {
                    x.output();
                    System.out.print("\t\tLuong: "+x.Luong());
                    System.out.println();
                }
            }
        }
    }
}

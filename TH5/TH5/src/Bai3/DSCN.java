package Bai3;

import java.util.ArrayList;

public class DSCN {
    protected ArrayList<ConNguoi> ds= new ArrayList<>();
    public void ThemN(ConNguoi n) {
        ds.add(n);
    }

    public void XuatDSTheoLoai(byte loai) {
        if (loai == 1) {
            for (ConNguoi n : ds) {
                if (n instanceof Hocvien) {
                    n.output();
                    System.out.println();
                }
            }
        } else if(loai==2){
            for (ConNguoi n : ds) {
                if (n instanceof NhanvienQL) {
                    n.output();
                    System.out.println();
                }
            }
        }else if(loai==3) {
            for (ConNguoi n : ds) {
                if (n instanceof GiaoVien) {
                    n.output();
                    System.out.println();
                }
            }
        }
    }
}

package Bai3;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        byte chon,loai;
        Scanner doc = new Scanner(System.in);
        DSCN dsn = new DSCN();
        ConNguoi n;
        do {
            System.out.println("\n#############################################");
            System.out.println("#\t1: Nhap mot doi tuong vao danh sach\t\t#");
            System.out.println("#\t2: Xuat doi tuong theo loai\t\t\t\t#");
            System.out.println("#\t0: Thoat\t\t\t\t        \t\t#");
            System.out.println("#############################################\n");
            System.out.print("Chon chuc nang: ");
            chon=doc.nextByte();
            switch(chon) {
                case 1:
                    System.out.print("1: Hoc vien, 2: Nhan vien quan ly, 3: Giao vien. Hay chon doi tuong: ");
                    loai=doc.nextByte();
                    if(loai==1) {
                        n= new Hocvien();
                    }else if(loai==2) {
                        n=new NhanvienQL();
                    }else if(loai==3) {
                        n=new GiaoVien();
                    }else{
                        System.out.print("Chon sai, chon lai: \n");
                        break;
                    }
                    n.input();
                    dsn.ThemN(n);
                    break;
                case 2:
                    System.out.print("Xuat danh sach doi tuong nao (1:Hoc vien/2:Nhan vien quan ly/3:Giao vien): ");
                    loai=doc.nextByte();
                    dsn.XuatDSTheoLoai(loai);
                    break;
                default:
                    chon=0;
                    break;
            }
        }while(chon!=0);

    }

}
package Bai1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        HangHoa myHh = new HangHoa("ma1","Thuoc",10000);
//        HangDM myHdm = new HangDM("ma2","Tivi",2000000,"12Thang",220,110);
//        HangTP myHtp = new HangTP("ma3","Xoai",15000,"12/3/2024","22/3/2024");
//        myHh.output();
//        System.out.println();
//        myHdm.outputDM();
//        System.out.println();
//        myHtp.outputTP();
//        HangHoa myHh = new HangHoa();
//
//        myHh.input();
//        myHh.output();
//        HangDM myHdm = new HangDM();
//        myHdm.inputDM();
//        myHdm.outputDM();
//        HangTP myHtp = new HangTP();
//        myHtp.inputTP();
//        myHtp.outputTP();
        byte chon,loai;
        Scanner x = new Scanner(System.in);
        DSHH myds = new DSHH();
        HangHoa h;
        do {
            System.out.println("############################################");
            System.out.println("#\t1: Them mot mat hang vao danh dach\t   #");
            System.out.println("#\t2: Xuat mat hang theo loai \t\t       #");
            System.out.println("#\t0: Thoat\t\t                       #");
            System.out.println("############################################");
            System.out.print("Chon chuc nang: ");
            chon = x.nextByte();
            switch (chon){
                case 1:
                    System.out.println("1: Hang dien may <======> 2: Hang thuc pham");
                    System.out.print("\t\tHay chon loai mat hang: ");
                    loai = x.nextByte();
                    if(loai==1)
                        h = new HangDM();
                    else
                        h = new HangTP();
                    h.input();
                    myds.Them1Hh(h);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Xuat danh sach mat hang nao (1:DM/2:TP): ");
                    byte loaimh = x.nextByte();
                    myds.XuatTheoLoai(loaimh);
                    System.out.println();
                    break;
                default:
                    chon=0;
                    break;
            }
        }while (chon!=0);
    }
}

package Bai1;

import java.util.Scanner;

public class demoarray {
    public static void main(String[] args) {
        byte chon,loai;
        Scanner x = new Scanner(System.in);
        DSHHArr mydsarr = new DSHHArr();
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
                    mydsarr.themMH(h);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Xuat danh sach mat hang nao (1:DM/2:TP): ");
                    byte loaimh = x.nextByte();
                    mydsarr.XuatTheoLoai(loaimh);
                    System.out.println();
                    break;
                default:
                    chon=0;
                    break;
            }
        }while (chon!=0);
    }
}

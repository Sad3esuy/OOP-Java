
import java.util.*;
public class demo {
    public static void main(String[] args) {
        NhanVien.setLuongcb(100000);
//        NhanVien myQL = new NhanVienQL("ma2","Tivi",2144,"tsi","HN","Toan",12000);
//        NhanVien myNC = new NhanVienNC("ma3","Xoai",5646,"thso","dsa","sfdfg",20000);
//        NhanVien myPV = new NhanVienPV("ma1","fsdf",254345,"tsi");
//        //        myHv.output();
//        System.out.println();
//        myQL.output();
//        System.out.print("\t\tLuong: "+myQL.Luong());
//        System.out.println();
//        myNC.output();
//        System.out.print("\t\tLuong: "+myNC.Luong());
//        System.out.println();
//        myPV.output();
//        System.out.print("\t\tLuong: "+myPV.Luong());

        byte chon,type;
        Scanner x = new Scanner(System.in);
        HocVien ds = new HocVien();
        NhanVien b;
        do{
            System.out.println("1: Them 1 nhan vien");
            System.out.println("2: DS nhan vien");
            System.out.println("3: In bang luong nhan vien");
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
                    ds.XuatDS();
                    System.out.println();
                    break;
                case 3:
                    ds.BangLuong();
                    System.out.println();
                    break;
                default:
                    chon=0;
                    break;
            }
        }while(chon!=0);
    }
}

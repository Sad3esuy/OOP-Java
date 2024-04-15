import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        byte chon;
        ConNguoi a = new HocVien();
        ConNguoi b = new NhanVien();
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("1: Nhap 1 hoc vien");
            System.out.println("2: Nhap 1 nhan vien");
            System.out.println("3: Xuat 1 hoc vien");
            System.out.println("4: Xuat 1 Nhan vien");
            System.out.println("5: Thoat");
            System.out.print("Hay chon chuc nang: ");
            chon = x.nextByte();
            switch (chon){
                case 1:
                    System.out.println("NHAP THONG TIN 1 HOC VIEN");
                    a.input();
                    break;
                case 2:
                    System.out.println("NHAP THONG TIN 1 NHAN VIEN");
                    b.input();
                    break;
                case 3:
                    System.out.println("THONG TIN HOC VIEN");
                    a.output();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("THONG TIN NHAN VIEN");
                    b.output();
                    System.out.println();
                    break;
                case 5:
                    chon=0;
                    break;
            }
        }while(chon!=0);
    }
}

package nguyenquyngoc;

import java.util.Scanner;

public class HocSinh {
    String maso,hoten;
    Float dtb;
    Scanner sc = new Scanner(System.in);

    public int nhapn() {
        System.out.print("Nhap so luong Hs: ");
        int n = sc.nextInt();
        return n;
    }
    public void input() {
        System.out.print("Nhap ma so Hs: ");
        maso = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
    }

    public void output() {
        System.out.print("Ma so HS: " + maso + "\t\tHo ten: " + hoten + "\t\tDTB: " + dtb);
    }

    public void rank() {
        if(dtb<5)
            System.out.println("\t\tXep loai: Kem\n");
        else
        {
            if(dtb>=5 && dtb<8.5)
                System.out.println("\t\tXep loai: Trung Binh\n");
            else
                System.out.println("\t\tXep loai: Gioi\n");
        }
    }


}

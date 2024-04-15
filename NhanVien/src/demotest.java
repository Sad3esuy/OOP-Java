import java.util.Scanner;

public class demotest {
    public static void main(String[] args) {
        NhanVien myNv1 = new NhanVien();
        myNv1.output();
        //System.out.println("\t\tTong luong: " + myNv1.Tongluong());


        NhanVien myNv2 = new NhanVien("234","nguyen quan tuan",2);
        myNv2.output();
        //System.out.println("\t\tTong luong: " + myNv2.Tongluong());


        NhanVien myNv3 = new NhanVien(myNv2);
        myNv3.output();
        //System.out.println("\t\tTong luong: " + myNv3.Tongluong());



        NhanVien myNv4 = new NhanVien();
        myNv4.input();
        myNv4.output();
        myNv4.changeName();
        myNv4.output();
        //System.out.println("\t\tTong luong: " + myNv1.Tongluong());


        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong Hs: ");
        int n = x.nextInt();
        NhanVien a[] = new NhanVien[n];
        // Khởi tạo mỗi phần tử của mảng
        for(int i=0;i<a.length;i++)
        {
            a[i]=new NhanVien();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap nhan vien " + (i+1) + ":");
            a[i].input();
        }
        for(int i=0;i<n;i++)
        {
            a[i].output();
            System.out.print("Tong luong: " + a[i].Tongluong());
            System.out.println();
        }

        NhanVien.dem();

    }
}

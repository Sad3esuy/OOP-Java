import java.io.*;
import java.util.*;
public class NhanVien {
    String ma,hoten;
    double hesoLuong;
    private static long luongCB = 100000;
    private static int count;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }
    Scanner x = new Scanner(System.in);

    public NhanVien(){
        setMa("null");
        setHoten("null");
        setHesoLuong(0);
        //luongCB = 0;
        //count++;
    }
    public NhanVien(String ma,String hoten,double hesoLuong){
        setMa(ma);
        setHoten(hoten);
        setHesoLuong(hesoLuong);
        //count++;
    }
    public NhanVien(NhanVien a)
    {
        setMa(a.ma);
        setHoten(a.hoten);
        setHesoLuong(a.hesoLuong);
        //count++;
    }
    public void input()
    {
        System.out.print("Nhap ma nv: ");
        setMa(x.nextLine());
        System.out.print("Nhap ho ten nv: ");
        setHoten(x.nextLine());
        System.out.print("Nhap he so luong: ");
        setHesoLuong(x.nextDouble());
        count++;
    }
    public void output(){
        System.out.print("Ma: " + getMa() + "\t\tHo ten nv: " + getHoten() +"\t\tHe so luong: " + getHesoLuong());
        System.out.println();
    }
    public double Tongluong(){
        double tong =getHesoLuong()*luongCB;
        return tong;
    }
    public static int dem(){
        System.out.println("So luong nhan vien: " + count);
        return 0;
    }
    public void changeName() {
        System.out.print("Nhap ten moi can doi: ");
        x.nextLine();// Xóa bo dem
        hoten = x.nextLine();
        System.out.println("Ten nhan vien da duoc thay doi: " + hoten);
    }
}
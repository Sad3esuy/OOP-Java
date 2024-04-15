package Bai1;

public class demo {
    public static void main(String[] args) {
        NhanVien.setLuongcb(100000);
        NhanVien myQL = new NhanVienQL();
        myQL.input();
        myQL.output();
        System.out.print("\t\tLuong: "+myQL.Luong());
        System.out.println();
        NhanVien myNC = new NhanVienNC();
        myNC.input();
        myNC.output();
        System.out.print("\t\tLuong: "+myNC.Luong());
        System.out.println();
        NhanVien myPV = new NhanVienPV();
        myPV.input();
        myPV.output();
        System.out.print("\t\tLuong: "+myPV.Luong());
    }
}

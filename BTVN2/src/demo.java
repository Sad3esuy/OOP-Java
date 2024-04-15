import java.lang.constant.PackageDesc;

public class demo {
    public static void main(String[] args) {

    //Constructor co tham so
    PhanSo myPs1 = new PhanSo(3,5);
    myPs1.output();
    //Constructor khong tham so
    PhanSo myPs2 = new PhanSo();
    myPs2.output();

    //Nhap phan so
    PhanSo myPs = new PhanSo();
    myPs.input();
    myPs.output();
//    PhanSo myPs1 = new PhanSo(1,2);
//    myPs1.input(1,9);
//    myPs1.output();

    int Ucln = myPs.UCLN(myPs.getTu(), myPs.getMau());
    System.out.println("Uoc chung lon nhat: " + Ucln);

    myPs.RutGon();
    System.out.print("Sau khi rut gon: \t");
    myPs.output();
    System.out.print("Phan so duoc cong tru: \t");
    myPs1.output();
//
//    PhanSo CongPs = new PhanSo();
//    PhanSo kq = CongPs.congPhanSo(myPs, myPs1);
//    System.out.println("Ket qua cong hai phan so:");
//    kq.output();

    myPs.congPhanSo(myPs1);
    myPs.truPhanSo(myPs1);

    }
}


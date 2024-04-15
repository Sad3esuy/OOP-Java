package Bai5;

public class demo {
    public static void main(String[] args) {
        TamGiac myTg = new TamGiac(3,4,5);
        double kq = myTg.ChuViTamGiac();
        System.out.println("Chu vi: " + kq);
        double tp =  myTg.DienTich();
        System.out.println("Dien tich: " + tp);
        System.out.println( TamGiac.LoaiTamGiac(myTg.getT1(), myTg.getT2(), myTg.getT3()));
    }
}

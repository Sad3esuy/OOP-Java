package Bai3;

public class demo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        COODINATE diem1 = new COODINATE(-2,4);
        COODINATE diem2 = new COODINATE(3,4);
        COODINATE tong = diem1.tinhTong(diem2);
        System.out.println("Tong cac thanh phan x va y cua 2 diem: ");
        tong.inToaDo();
        COODINATE doixung = diem1.timdoixung();
        System.out.println("Diem doi xung qua truc hoanh: ");
        doixung.inToaDo();

    }

}
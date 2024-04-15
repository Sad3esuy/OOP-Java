package Bai1;

public class demo {
    public static void main(String[] args) {
        DSHS myDs = new DSHS();
        myDs.nhapN();
        myDs.nhapDS();

        System.out.println("\nDanh sach Hoc sinh sau khi sap xep: ");
        myDs.SapXep();
        myDs.xuatDS();
    }
}

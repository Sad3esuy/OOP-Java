package Bai7;

public class demo {
    public static void main(String[] args) {
    HCN myHcn = new HCN(4);
    double cv = myHcn.findPerimeter();
    System.out.println("Chu vi: " + cv);
    double dt = myHcn.findArea();
    System.out.println("Dien tich: " + dt);

    HCN myHcn1 = new HCN(5,2);
    double cv1 = myHcn1.findPerimeter();
    System.out.println("Chu vi: " + cv1);
    double dt1 = myHcn1.findArea();
    System.out.println("Dien tich: " + dt1);
    }
}

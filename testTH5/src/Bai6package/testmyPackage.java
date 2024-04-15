package Bai6package;
import MyPackage.Calculate;
import MyPackage.Shape.Circle;
public class testmyPackage {
    public static void main(String[] args) {
        System.out.println(Calculate.Volume(3,4,5));
        Circle C=new Circle(5);
        System.out.println(C.Area());
    }
}

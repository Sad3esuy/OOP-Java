package Bai6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class HinhVuong implements Hinh{
    private double canh;
    public HinhVuong(){

    }
    public HinhVuong(double canh){
        this.canh=canh;
    }
    public void nhap(){
        Scanner x=new Scanner(System.in);
        System.out.print("Nhap canh: ");
        canh = x.nextDouble();
    }
    public void xuat(){
        System.out.print("Canh hv: "+canh+"\t\t");
    }

    @Override
    public double dientich() {
        return canh*canh;
    }
}

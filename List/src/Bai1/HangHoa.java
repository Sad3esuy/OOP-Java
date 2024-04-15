package Bai1;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

class HangHoa {
    protected String ma,name;
    protected double gia;

    public HangHoa(){
        ma=null;
        name=null;
        gia=0;
    }

    public HangHoa(String ma,String name,double gia)
    {
        this.ma=ma;
        this.name=name;
        this.gia=gia;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        ma = x.nextLine();
        System.out.print("Nhap ten hang: ");
        name = x.nextLine();
        System.out.print("Nhap gia: ");
        gia = x.nextDouble();
    }
    public void output(){
        System.out.print("Ma hang: "+ma+"\t\tTen hang: "+name+"\t\tGia: "+gia);
    }
}
class HangDM extends HangHoa{
    protected String ThgianBH;
    protected double V,P;

    public HangDM(){
        super();
        ThgianBH=null;
        V=P=0;
    }
    public HangDM(String ma,String name,double gia,String ThgianBH,double V,double P){
        super(ma, name, gia);
        this.ThgianBH=ThgianBH;
        this.V=V;
        this.P=P;
    }
    public void input(){
        System.out.println("\t\tNHAP THONG TIN HANG DIEN MAY");
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap thoi gian bao hanh: ");
        ThgianBH = x.nextLine();
        System.out.print("Nhap dien ap: ");
        V = x.nextDouble();
        System.out.print("Nhap cong suat: ");
        P = x.nextDouble();
    }
    public void output(){
        super.output();
        System.out.print("\t\tBH: "+ThgianBH+"\t\tDien ap: "+V+"\t\tCong suat: "+P);
    }
}
class HangTP extends HangHoa{
    protected String nsx,hsd;

    public HangTP(){
        super();
        nsx=hsd=null;
    }
    public HangTP(String ma,String name,double gia,String nsx,String hsd){
        super(ma, name, gia);
        this.nsx=nsx;
        this.hsd=hsd;
    }
    public void input(){
        System.out.println("\t\tNHAP THONG TIN HANG THUC PHAM");
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap ngay san xuat: ");
        nsx = x.nextLine();
        System.out.print("Nhap hang su dung: ");
        hsd = x.nextLine();
    }
    public void output(){
        super.output();
        System.out.print("\t\tNSX: "+nsx+"\t\tHSD: "+hsd);
    }
}
package baitap;

class HangHoa {
    protected String ma,name,nhaSX;
    protected double gia;

    public HangHoa(String ma,String name,String nhaSX,double gia)
    {
        this.ma=ma;
        this.name=name;
        this.nhaSX=nhaSX;
        this.gia=gia;
    }
    public void output(){
        System.out.println("Ma hang: "+ ma + "\t\tTen hang: "+name+"\t\tNha san xuat: "+nhaSX+"\t\tGia: "+gia);
    }
}
class DienMay extends HangHoa{
    protected double ThgianBH,dienap;
    protected int P;

    public DienMay(String ma,String name,String nhaSX,double gia,double ThgianBH,double dienap,int P){
        super(ma, name, nhaSX, gia);
        this.ThgianBH=ThgianBH;
        this.dienap=dienap;
        this.P=P;
    }
    public void output(){
        System.out.println("Ma hang: "+ ma + "\t\tTen hang: "+name+"\t\tNha san xuat: "+nhaSX+"\t\tGia: "+gia+"\t\tThoi gian bao hanh: "+ThgianBH+"\t\tDien ap: "+dienap+"\t\tCong suat: "+P);
    }
}
class ThucPham extends HangHoa{
    protected String nsx,hsd;
    public ThucPham(String ma,String name,String nhaSX,double gia,String nsx,String hsd){
        super(ma, name, nhaSX, gia);
        this.nsx=nsx;
        this.hsd=hsd;
    }
    public void output(){
        System.out.println("Ma hang: "+ ma + "\t\tTen hang: "+name+"\t\tNha san xuat: "+nhaSX+"\t\tGia: "+gia+"\t\tNgay SX: "+nsx+"\t\tNgay het hang: "+hsd);
    }
}

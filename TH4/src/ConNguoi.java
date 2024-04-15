import java.awt.font.NumericShaper;
import java.util.Scanner;

class ConNguoi {
    protected String name;
    protected int namsinh;
    public ConNguoi(){

    }
    public ConNguoi(String name,int namsinh)
    {
        this.name=name;
        this.namsinh=namsinh;
    }

    public void input(){
        Scanner x =new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = x.nextLine();
        System.out.print("Nhap nam sinh: ");
        namsinh = x.nextInt();
    }
    public void output(){
        System.out.print("Ho ten: "+ name);
        System.out.print("\t\tNam sinh: "+ namsinh);
    }
}

class HocVien extends ConNguoi{
    protected double diem1,diem2,diem3;

    public HocVien(){

    }
    public HocVien(String name,int namsinh,double diem1,double diem2,double diem3)
    {
        super(name, namsinh);
        this.diem1=diem1;
        this.diem2=diem2;
        this.diem3=diem3;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap diem 1: ");
        diem1 = x.nextInt();
        System.out.print("Nhap diem 2: ");
        diem2 = x.nextInt();
        System.out.print("Nhap diem 3: ");
        diem3 = x.nextInt();
    }
    public void output(){
        super.output();
        System.out.print("\t\tDiem 1: "+ diem1);
        System.out.print("\t\tDiem 2: "+ diem2);
        System.out.print("\t\tDiem 3: "+ diem3);
    }
}
class PhongBK{
    protected String maPbk,namePbk;

    public PhongBK(){}
    public PhongBK(String maPbk,String namePbk){
        this.maPbk=maPbk;
        this.namePbk=namePbk;
    }
    public void inputpbk(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma PBK: ");
        maPbk = x.nextLine();
        System.out.print("Nhap ten PBK: ");
        namePbk = x.nextLine();
    }
    public void outputpbk(){
        System.out.print("\t\tMa Pbk: "+ maPbk);
        System.out.print("\t\tTen Pbk: "+ namePbk);
    }
}

class NhanVien extends ConNguoi{
    protected double luong;
    protected String ngaynhanviec;

    protected PhongBK pbk = new PhongBK();

    public NhanVien(){

    }
    public NhanVien(String name,int namsinh,double luong,String ngaynhanviec){
        super(name,namsinh);
        this.luong=luong;
        this.ngaynhanviec=ngaynhanviec;
    }

    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        pbk.inputpbk();
        System.out.print("Nhap luong: ");
        luong = x.nextDouble();
        x.nextLine();
        System.out.print("Nhap ngay nhan viec: ");
        ngaynhanviec = x.nextLine();
    }
    public void output(){
        super.output();
        pbk.outputpbk();
        System.out.print("\t\tLuong: " + luong);
        System.out.print("\t\tNgay nhan viec: "+ ngaynhanviec);
    }
}
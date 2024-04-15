import java.util.Scanner;

abstract class NhanVienDT extends NhanVien{
    protected String truongDT,chuyenmon;
    public NhanVienDT(){

    }
    public NhanVienDT(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon){
        super(ma, name, namsinh, trinhdo);
        this.truongDT=truongDT;
        this.chuyenmon=chuyenmon;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap truong dao tao: ");
        truongDT = x.nextLine();
        System.out.print("Nhap chuyen mon: ");
        chuyenmon = x.nextLine();
    }
    public void output(){
        super.output();
        System.out.print("\t\tTruong dao tao: " + truongDT);
        System.out.print("\t\tChuyen mon: " + chuyenmon);
    }
}
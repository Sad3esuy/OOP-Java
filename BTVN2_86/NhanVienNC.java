
import java.util.Scanner;

public class NhanVienNC extends NhanVienDT{
    protected long phucapdh;
    public NhanVienNC(){
        super();
    }
    public NhanVienNC(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon,long phucapdh){
        super(ma, name, namsinh, trinhdo, truongDT, chuyenmon);
        this.phucapdh=phucapdh;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap DH: ");
        phucapdh = x.nextLong();
    }
    public void output(){
        super.output();
        System.out.print("\t\tPhu cap DH: "+phucapdh);
    }
    public long Luong(){
        return super.getLuongcb() + phucapdh;
    }
}
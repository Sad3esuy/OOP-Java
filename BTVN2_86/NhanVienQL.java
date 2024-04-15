
import java.util.Scanner;

public class NhanVienQL extends NhanVienDT{
    protected long phucapcv;
    public NhanVienQL(){
        super();
    }
    public NhanVienQL(String ma,String name,int namsinh,String trinhdo,String truongDT,String chuyenmon,long phucapcv){
        super(ma, name, namsinh, trinhdo, truongDT, chuyenmon);
        this.phucapcv=phucapcv;
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
        System.out.print("Nhap phu cap CV: ");
        phucapcv = x.nextLong();
    }
    public void output(){
        super.output();
        System.out.print("\t\tPhu cap CV: "+phucapcv);
    }
    public long Luong(){
        return super.getLuongcb() + phucapcv;
    }
}

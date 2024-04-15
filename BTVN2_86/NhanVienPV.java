

import java.util.Scanner;

public class NhanVienPV extends NhanVien{

    public NhanVienPV(){
        super();
    }
    public NhanVienPV(String ma,String name,int namsinh,String trinhdo){
        super(ma,name,namsinh,trinhdo);
    }
    public void input(){
        Scanner x = new Scanner(System.in);
        super.input();
    }
    public void output(){
        super.output();
    }
    public long Luong(){
        return super.getLuongcb();
    }
}

package Bai1;

import java.util.Scanner;

public class NhanVienPV extends NhanVien{

    public NhanVienPV(){
        super();
    }
    public NhanVienPV(String ma,String name,String trinhdo){
        super(ma,name,trinhdo);
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

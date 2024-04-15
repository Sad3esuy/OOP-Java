import java.util.*;
public class HocVien {
    ArrayList<NhanVien> dsnv = new ArrayList<>();

    public void Them1HV(NhanVien h){
        dsnv.add(h);
    }
    public void XuatDS(){
        System.out.println("################\tDANH SACH NHAN VIEN\t###################");
        for (NhanVien x : dsnv){
            x.output();
            System.out.println();
        }
    }
    public void BangLuong(){
        System.out.println("################\tBANG LUONG NHAN VIEN\t###################");
        for(NhanVien x : dsnv){
            System.out.print(x.getName() + "\t\tLuong: " + x.Luong());
            System.out.println();
        }
    }

}

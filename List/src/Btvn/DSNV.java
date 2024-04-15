//package Btvn;
//
//import Btvn.NhanVienNghienCuu;
//import Btvn.NhanVienQuanLy;
//import Btvn.hocvien;
//
//public class DSNV {
//    private int sl;
//    private hocvien dshv[];
//
//    public DSNV(){
//        dshv = new  hocvien[100];
//        sl=0;
//    }
//    public void Them1nv(hocvien h){
//        dshv[sl]=h;
//        sl++;
//    }
//    public void XuatTheoLoai(byte loai){
//        if(loai==1){
//            System.out.println("\t\t\t\t##################### DANH SACH NHAN VIEN QUAN LY ##########################");
//            for(int i=0;i<sl;i++)
//            {
//                if(dshv[i] instanceof NhanVienQuanLy)
//                {
//                    dshv[i].output();
//                    System.out.println();}
//            }}
//        else{
//            System.out.println("\t\t\t\t##################### DANH SACH NHAN VIEN NGHIEN CUU ##########################");
//            for(int i=0;i<sl;i++)
//            {
//                if(dshv[i] instanceof NhanVienNghienCuu){
//                    dshv[i].output();
//                    System.out.println();}
//            }}
//    }
//}

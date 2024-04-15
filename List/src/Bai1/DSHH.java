package Bai1;

import javax.swing.*;

public class DSHH {
    private int sl;
    private HangHoa dshh[];

    public DSHH(){
        dshh = new  HangHoa[100];
        sl=0;
    }
    public void Them1Hh(HangHoa h){
        dshh[sl]=h;
        sl++;
    }
    public void XuatTheoLoai(byte loai){
        if(loai==1){
            System.out.println("\t\t\t\t##################### DANH SACH HANG DIEN MAY ##########################");
            for(int i=0;i<sl;i++)
            {
                if(dshh[i] instanceof HangDM)
                {
                    dshh[i].output();
                    System.out.println();}
            }}
        else{
            System.out.println("\t\t\t\t##################### DANH SACH HANG THUC PHAM ##########################");
            for(int i=0;i<sl;i++)
            {
                if(dshh[i] instanceof HangTP){
                    dshh[i].output();
                    System.out.println();}
            }}
    }
    public void Xoa1Hh(HangHoa h){
        
    }
}

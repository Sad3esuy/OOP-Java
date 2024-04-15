package Bai1;

import java.util.*;

public class DSHHArr {
    List<HangHoa> dshh = new ArrayList<>();
    public void themMH(HangHoa h){
        dshh.add(h);
    }

    public void XuatTheoLoai(byte loai){
        if(loai==1){
            System.out.println("\t\t\t\t##################### DANH SACH HANG DIEN MAY ##########################");
            for(HangHoa h : dshh)
            {
                if(h instanceof HangDM) {
                    h.output();
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("\t\t\t\t##################### DANH SACH HANG THUC PHAM ##########################");
            for(HangHoa h : dshh)
            {
                if(h instanceof HangTP) {
                    h.output();
                    System.out.println();
                }
            }
        }
    }
}

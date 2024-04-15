package Bai1;

import java.util.Scanner;

public class DSHS {
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int n;
    private HocSinh hs[]=new HocSinh[n];
    Scanner x = new Scanner(System.in);
    public void nhapN(){
        System.out.print("Nhap so luong hoc sinh: ");
        setN(x.nextInt());
        hs=new HocSinh[n];
        for(int i=0;i< hs.length;i++)
            hs[i]=new HocSinh();
    }
    public void nhapDS(){
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin Hoc Sinh thu "+(i+1)+":");
            hs[i].input();
        }
    }
    public void xuatDS(){
        for(int i=0;i<n;i++){
            hs[i].output();
        }
    }
    public void SapXep(){
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(hs[i].getDtb()<hs[j].getDtb())
                {
                    HocSinh tmp=hs[i];
                    hs[i]=hs[j];
                    hs[j]=tmp;
                }
    }
}

import java.util.Scanner;

public class Mang {
    private int n;
    private int a[];
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    Scanner x = new Scanner(System.in);
    public void input(){
        System.out.print("Nhap so phan tu mang: ");
        setN(x.nextInt());
        a = new int[getN()];
        for(int i=0;i<n;i++)
        {
            System.out.print("a[" + i + "]: ");
            a[i]=x.nextInt();
        }
    }
    public void output(){
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + "\t");
        }
    }

    public double TBLe(){
        int dem = 0;
        double tong = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                dem++;
                tong+=a[i];
            }
        }
        return tong/dem;
    }
    public void maxMang(){
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("\nMax = " + max);
    }
    public void SapXep(){
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
    }
}

import java.util.Scanner;

public class CD {
    private int maCD, sl;
    private String nameCD, Casi;
    private double gia;

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public String getCasi() {
        return Casi;
    }

    public void setCasi(String casi) {
        Casi = casi;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public CD(){

    }
    public CD(int maCD,String nameCD,String casi,int sl,double gia){
        setMaCD(maCD);
        setNameCD(nameCD);
        setCasi(casi);
        setSl(sl);
        setGia(gia);
    }

    @Override
    public String toString() {
        return "Ma CD: "+ maCD +"\t\tTen CD: "+nameCD+"\t\tCa si: "+Casi+"\t\tSo luong: "+sl+"\t\tGia: "+gia;
    }
    //@Override
//    public boolean equals(Object obj){
//        if(obj == this)
//            return true;
//        else
//            return
//    }

    public void input(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma CD: ");
        setMaCD(x.nextInt());
        x.nextLine();
        System.out.print("Nhap ten CD: ");
        setNameCD(x.nextLine());
        System.out.print("Nhap ten Ca si: ");
        setCasi(x.nextLine());
        System.out.print("Nhap so luong: ");
        setSl(x.nextInt());
        System.out.print("Nhap gia: ");
        setGia(x.nextDouble());
    }
    public void outout(){

    }
}

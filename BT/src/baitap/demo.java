package baitap;

class demo {
    public static void main(String[] args) {
        HangHoa myHh = new HangHoa("ma1","Thuoc","China",120000);
        DienMay myDm = new DienMay("ma2","Tivi","China",100000,12,220,120);
        ThucPham myTp = new ThucPham("ma3","Xoai","VietNam",10000,"12/3/2024","16/3/2024");
        myHh.output();
        System.out.println();
        myDm.output();
        System.out.println();
        myTp.output();
        System.out.println();
    }
}
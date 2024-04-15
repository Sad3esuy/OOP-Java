public class demomang {
    public static void main(String[] args) {
        Mang myMang = new Mang();

        myMang.input();
        myMang.output();

        System.out.print("\nTong cac so le cua mang: " + myMang.TBLe());
        myMang.maxMang();
        System.out.println("Mang sau khi sap xep tang:");
        myMang.SapXep();
        myMang.output();
    }
}

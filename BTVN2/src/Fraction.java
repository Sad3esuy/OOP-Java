public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor chuẩn không tham số
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1; // Tránh chia cho 0
    }

    // Constructor có tham số
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            // Xử lý trường hợp mẫu số là 0
            System.out.println("Mẫu số không được là 0. Đặt mẫu số mặc định là 1.");
            this.denominator = 1;
        }
    }

    // Các phương thức getter và setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Mẫu số không được là 0. Không thay đổi giá trị.");
        }
    }

    // Phương thức để in phân số ra màn hình
    public void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        // Tạo một phân số mới với constructor có tham số
        Fraction fraction1 = new Fraction(3, 5);
        fraction1.printFraction();

        // Tạo một phân số mới với constructor không tham số
        Fraction fraction2 = new Fraction();
        fraction2.printFraction();
    }
}

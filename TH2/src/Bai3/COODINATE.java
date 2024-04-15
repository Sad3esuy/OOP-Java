package Bai3;

import javax.security.sasl.SaslClient;
public class COODINATE {
    private double x;
    private double y;
    public COODINATE(double x, double y) {
        setX(x);
        setY(y);
    }
    public COODINATE() {
        x = 0;
        y = 0;
    }
    public COODINATE(COODINATE c) {
        setX(c.x);
        setY(c.y);
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public COODINATE tinhTong(COODINATE c) {
        double sumX = this.x + c.x;
        double sumY = this.y + c.y;
        COODINATE kq = new COODINATE(sumX,sumY);
        return kq;
    }
    public COODINATE timdoixung() {
        return new COODINATE(this.x, -this.y);
    }
    public void inToaDo() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
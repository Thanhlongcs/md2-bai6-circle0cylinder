package rikkei.academy;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double thetich(){
        return height*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height=" + height +
                ", the tich= " +thetich()+
                '}';
    }
}

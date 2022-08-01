package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // test circle
        Circle circle = new Circle();
        circle.setRadius(9);
        circle.setColor("blue");
        System.out.println(circle);
        // test cylinder
        Cylinder cylinder= new Cylinder(circle.getRadius(), circle.getColor(), 13);
        System.out.println(cylinder);
    }
}

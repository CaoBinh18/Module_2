package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle ci = new Circle();
        ci.setRadius(1.0);
        ci.setColor("red");
        System.out.println("Radius = " + ci.getRadius());
        System.out.println("Area = " + ci.getArea());
        System.out.print("Color: " + ci.getColor());
    }
}

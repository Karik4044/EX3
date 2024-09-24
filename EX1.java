public class EX1
{
    private double radius;
    private String color;

    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "red";

    public EX1() {
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }
    public EX1(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }
    public EX1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

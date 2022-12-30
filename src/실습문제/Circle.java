package 실습문제;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }
    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void calculationArea() {
        this.area = Math.PI * radius * radius;
    }
}

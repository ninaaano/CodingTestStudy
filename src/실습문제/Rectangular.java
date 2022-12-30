package 실습문제;

public class Rectangular extends Shape {
    private double width;
    private double height;

    public Rectangular() {
    }

    public Rectangular(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void calculationArea() {
        area = width * height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
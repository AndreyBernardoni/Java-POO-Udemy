package entities;

public class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(Color color){
        super(color);
    }
    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
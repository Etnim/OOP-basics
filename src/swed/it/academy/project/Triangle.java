package swed.it.academy.project;

public class Triangle extends Shape{
    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    void calculateArea() {
        super.rectangleArea();
        super.setArea(super.getArea()/2);
    }
}

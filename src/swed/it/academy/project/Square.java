package swed.it.academy.project;

public class Square extends Shape{
    public Square(double side) {
        super(side, side);
    }

    @Override
    void calculateArea() {
        super.rectangleArea();
    }
}

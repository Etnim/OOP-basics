package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    void calculateArea() {
        super.rectangleArea();
        double areaCircle = Math.PI * super.getArea();
        BigDecimal roundedArea = new BigDecimal(areaCircle).setScale(2, RoundingMode.UP);
        super.setArea(roundedArea.doubleValue());
    }


}

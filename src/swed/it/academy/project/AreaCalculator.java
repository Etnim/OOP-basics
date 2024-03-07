package swed.it.academy.project;

public class AreaCalculator {
    public static void main(String[] args) {
        runCalculator();
    }
    private static void runCalculator(){
        userInteraction();
        outputArea();
    }

    private static void userInteraction(){
        IOManager.setShapeType();
        try {
            IOManager.setData();
        }catch (UnknownShapeException e){
            System.out.println(e.getExcMessage());
        }
    }

    private static void outputArea(){
        Shape shape =
                switch (IOManager.getShapeType()){
                    case CIRCLE -> {
                        yield new Circle(IOManager.getData1());
                    }
                    case SQUARE -> {
                        yield new Square(IOManager.getData1());
                    }
                    case TRIANGLE -> {
                        yield new Triangle(IOManager.getData1(), IOManager.getData2());
                    }
                    default -> {
                        yield null;
                    }
                };
        if (shape != null){
            shape.calculateArea();
            IOManager.showCalculatedArea(shape.toString());
        }
    }
}

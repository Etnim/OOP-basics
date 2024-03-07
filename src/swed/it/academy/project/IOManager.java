package swed.it.academy.project;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IOManager {
    static final Scanner scanner = new Scanner(System.in);
    private static ShapeType shapeType;
    private static double data1;
    private static double data2;

    public static ShapeType getShapeType() {
        return shapeType;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }

    static void setShapeType() {

        System.out.println("Please type a shape number to chose the shape: \n 1 Square; \n 2 Triangle; \n 3 Circle");
        int input = 0;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Incorrect type of input, please enter number of one of the listed shapes");
        }
        catch (NoSuchElementException e){
            throw new NoSuchElementException("Nothing is entered, please type in a number of chosen shape");
        }
        switch (input) {
            case 1 -> shapeType = ShapeType.SQUARE;
            case 2 -> shapeType = ShapeType.TRIANGLE;
            case 3 -> shapeType = ShapeType.CIRCLE;
        }
    }

    static void setData() throws UnknownShapeException {
        switch (shapeType) {
            case ShapeType.SQUARE -> {
                System.out.println("Please type in a square's side length (cm):");

                data1 = scanner.nextDouble();
            }
            case ShapeType.TRIANGLE -> {
                System.out.println("Please type in the first side of a triangle:");
                data1 = scanner.nextDouble();
                System.out.println("Please type in second side of a triangle:");
                data2 = scanner.nextDouble();
            }
            case ShapeType.CIRCLE -> {
                System.out.println("Please type in radius of a circle:");
                data1 = scanner.nextDouble();
            }
            default -> {
                scanner.close();
                throw new UnknownShapeException("Unfortunately this shape is not listed in my database");
            }
        }
    }

    public static void showCalculatedArea(String str) {
        System.out.println(str);
        System.out.println("______________________");
    }
}

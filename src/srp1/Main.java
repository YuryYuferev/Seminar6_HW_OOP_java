package src.srp1;

import src.srp1.figure.Brush;
import src.srp1.figure.Square;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Brush brush = new Brush(square);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        brush.draw(square);
    }
}
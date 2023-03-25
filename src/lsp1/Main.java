package src.lsp1;

import src.lsp1.shape.Rectangle;
import src.lsp1.shape.Square;
import src.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);

        ShapeView view = new ShapeView(square);
        ShapeView view1 = new ShapeView(rectangle);

        view.showArea();
        view1.showArea();
    }
}
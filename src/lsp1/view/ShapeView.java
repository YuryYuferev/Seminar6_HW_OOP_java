package src.lsp1.view;

import src.lsp1.shape.Quadrilaterial;
public class ShapeView {

    private final Quadrilaterial quadrilaterial;


    public ShapeView(Quadrilaterial quadrilaterial) {
            this.quadrilaterial = quadrilaterial;
        }

        public void showArea() {

            System.out.print("Площадь четырехугольника равна:");
            System.out.println(quadrilaterial.getArea());
        }
    }
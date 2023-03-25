package src.srp1.figure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

    public class Square implements Figure {

        private final List<Point> points;
        private final int side;
        public Square(Point point1, int side) {
            this.side = side;
            Point point2 = new Point((int) (point1.getX() + side), (int) point1.getY());
            Point point3 = new Point((int) (point1.getX() + side), (int) (point1.getY() + side));
            Point point4 = new Point((int) point1.getX(), (int) (point1.getY() + side));
            points = new ArrayList<>(4);
            points.add(point1);
            points.add(point2);
            points.add(point3);
            points.add(point4);
        }
        public List<Point> getPoints() {
            return points;
        }
        public int getArea() {
            return side * side;
        }


            public int getSide() {
                return side;
            }
        }

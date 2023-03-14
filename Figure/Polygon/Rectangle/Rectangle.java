package Figure.Polygon.Rectangle;
import Figure.Polygon.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(Double sideA, Double sideB) throws Exception {
        if (sideA != 0 && sideB != 0) {
            this.sides.add(sideA);
            this.sides.add(sideB);
        } else throw new Exception ("Rectangle does not exist");
    }

    @Override
    public Double getArea() {
        return this.sides.get(0) * this.sides.get(1);
    }
}
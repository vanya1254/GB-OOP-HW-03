package Figure.Polygon.Triangle;
import Figure.Polygon.Polygon;

public class Triangle extends Polygon {

    public Triangle(Double sideA, Double sideB, Double sideC) throws Exception {
        if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
            this.sides.add(sideA);
            this.sides.add(sideB);
            this.sides.add(sideC);
        } else throw new Exception ("Triangle does not exist");
    }

    @Override
    public Double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.sides.get(0)) * (p - this.sides.get(1)) * (p - this.sides.get(2)));
    }
}
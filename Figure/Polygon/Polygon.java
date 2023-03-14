package Figure.Polygon;

import java.util.ArrayList;
import java.util.List;

import Figure.Figure;

public abstract class Polygon extends Figure {
    protected List<Double> sides = new ArrayList<>();

    protected Polygon(Double... sides) throws Exception {
        for (Double side : sides) {
            if (side <= 0) {
                throw new Exception("Polygon is not exist");
            }
        }
    }

    @Override
    public Double getPerimeter() {
        Double sum = 0.0;

        for (Double side : sides) {
            sum += side;
        }

        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s, Sides: %s, Perimeter: %2.1f", super.toString(), sides.toString(), this.getPerimeter());
    }
}
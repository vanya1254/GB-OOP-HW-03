package Figure.Circle;
import Figure.Figure;

public class Circle extends Figure {
    private Double radius;

    public Circle(Double radius) throws Exception {
        if (radius != 0) {
            this.radius = radius;
        } else throw new Exception ("Circle does not exist");
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
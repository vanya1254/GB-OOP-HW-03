public class Rectangle extends Figure {
    protected Double sideA;
    protected Double sideB;

    public Rectangle(Double sideA, Double sideB) throws Exception {
        if (sideA != 0 && sideB != 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else throw new Exception ("Rectangle does not exist");
    }

    @Override
    public Double getArea() {
        return sideA * sideB;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
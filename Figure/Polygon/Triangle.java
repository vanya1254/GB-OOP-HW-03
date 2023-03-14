import Figure.Figure;

public class Triangle extends Figure {
    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) throws Exception {
        if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else throw new Exception ("Triangle does not exist");
    }

    @Override
    public Double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
    
    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
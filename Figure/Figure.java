package Figure;
public abstract class Figure implements FigureInterface, Comparable<Figure> {

    @Override
    public String toString() {
        return String.format("%s, Area: %2.1f", this.getClass().getSimpleName(), this.getArea());
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
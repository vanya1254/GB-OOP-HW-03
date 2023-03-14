import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Figure.Figure;

public class Figures {
    private final List<Figure> figures = new ArrayList<>();

    public void showInfoAll() {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public void sortByArea() {
        Collections.sort(this.figures);
    }

    public void remove(int i) {
        this.figures.remove(i);
    }

    public void set(int i, Figure figure) {
        this.figures.set(i, figure);
    }
}
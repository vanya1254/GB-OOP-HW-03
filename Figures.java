import java.util.ArrayList;
import java.util.List;

import Figure.Figure;

public class Figures {
    private final List<Figure> figures = new ArrayList<>();

    public void showInfoAll() {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
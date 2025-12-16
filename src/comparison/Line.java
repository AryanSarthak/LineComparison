package comparison;

public class Line {
    private final double length;

    Line(int x1, int y1, int x2, int y2) {
        this.length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double getLength() {
        return length;
    }
}

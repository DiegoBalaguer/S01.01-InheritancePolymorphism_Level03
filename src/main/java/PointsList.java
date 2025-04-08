
/**
 * PROGRAM: PointsList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PointsList {
    private String text;
    private int points;

    public PointsList(String text, int points) {
        setText(text);
        setPoints(points);
    }

    private void setText(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to text.");
        } else
            this.text = r;
    }

    private void setPoints(int r) {
        if (r <= 0) {
            throw new IllegalArgumentException("The points must be equal or greater than 1.");
        } else
            this.points = r;
    }

    public String getText() {
        return text;
    }

    public double getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "PointsBoard{" +
                "text='" + text + '\'' +
                ", points=" + points +
                '}';
    }
}

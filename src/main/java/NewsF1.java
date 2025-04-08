import java.util.ArrayList;

/**
 * PROGRAM: MewsF1
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsF1 extends News {

    private String team;
    private static ArrayList<PricesList> pricesList;
    private static ArrayList<PointsList> pointsList;
    private static final double priceInit = 100;
    private static final int pointInit = 4;

    public NewsF1(String headline, String team) {
        super(headline);
        setTeam(team);
    }

    private void setTeam(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to team.");
        } else
            this.team = r;
    }

    public static void setPricesLists(ArrayList<PricesList> p) {
        NewsF1.pricesList = p;
    }

    public static void setPointsList(ArrayList<PointsList> p) {
        NewsF1.pointsList = p;
    }

    @Override
    public int calculatePointsNews() {
        int points = this.pointInit;

        for (PointsList list : this.pointsList) {
            if (list.getText().equalsIgnoreCase(this.team)) {
                points += list.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = this.priceInit;

        for (PricesList list : this.pricesList) {
            if (list.getText().equalsIgnoreCase(this.team)) {
                price += list.getPrice();
            }
        }
        return price;
    }

    @Override
    public ArrayList<String> listNews() {
        ArrayList<String> list = new ArrayList<>();

        list.add(super.getHeadline());
        list.add(super.getText());
        list.add("");
        list.add("");
        list.add("");
        list.add(this.team);
        list.add(String.valueOf(calculatePriceNews()));
        list.add(String.valueOf(calculatePointsNews()));

        return list;
    }

    @Override
    public String toString() {
        return "NewsF1{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}
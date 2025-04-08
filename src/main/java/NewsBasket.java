import java.util.ArrayList;

/**
 * PROGRAM: MewsBasket
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsBasket extends News {

    private String competition;
    private String club;
    private static ArrayList<PricesList> pricesList;
    private static ArrayList<PointsList> pointsList;
    private static final double priceInit = 250;
    private static final int pointInit = 4;

    public NewsBasket(String headline, String competition, String club) {
        super(headline);
        setCompetition(competition);
        setClub(club);
    }

    private void setCompetition(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to competition.");
        } else
            this.competition = r;
    }

    private void setClub(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to club.");
        } else
            this.club = r;
    }

    public static void setPricesLists(ArrayList<PricesList> p) {

        NewsBasket.pricesList = p;
    }

    public static void setPointsList(ArrayList<PointsList> p) {

        NewsBasket.pointsList = p;
    }

    public String getCompetition() {

        return competition;
    }

    public String getClub() {

        return club;
    }

    @Override
    public int calculatePointsNews() {

        int points = this.pointInit;

        for (PointsList list : this.pointsList) {
            if (list.getText().equalsIgnoreCase(this.competition) ||
                    list.getText().equalsIgnoreCase(this.club)) {
                points += list.getPoints();
            }
        }
        return points;
    }

    @Override
    public double calculatePriceNews() {
        double price = this.priceInit;

        for (PricesList list : this.pricesList) {
            if (list.getText().equalsIgnoreCase(this.competition) ||
                    list.getText().equalsIgnoreCase(this.club)) {
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
        list.add(this.competition);
        list.add(this.club);
        list.add("");
        list.add("");
        list.add(String.valueOf(calculatePriceNews()));
        list.add(String.valueOf(calculatePointsNews()));

        return list;
    }

    @Override
    public String toString() {
        return "NewsBasket{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                "} " + super.toString();
    }
}

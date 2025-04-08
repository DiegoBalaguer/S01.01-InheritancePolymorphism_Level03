import java.util.ArrayList;

/**
 * PROGRAM: MewsSoccer
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsSoccer extends News {

    private String competition;
    private String club;
    private String player;
    private static ArrayList<PricesList> pricesList;
    private static ArrayList<PointsList> pointsList;
    private static final double priceInit = 300;
    private static final int pointInit = 5;

    public NewsSoccer(String headline, String competition, String club, String player) {
        super(headline);
        setCompetition(competition);
        setClub(club);
        setPlayer(player);
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

    private void setPlayer(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to player.");
        } else
            this.player = r;
    }

    public static void setPricesLists(ArrayList<PricesList> p) {
        NewsSoccer.pricesList = p;
    }

    public static void setPointsList(ArrayList<PointsList> p) {
        NewsSoccer.pointsList = p;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public String getPlayer() {
        return player;
    }

    @Override
    public int calculatePointsNews() {
        int points = this.pointInit;

        for (PointsList list : this.pointsList) {
            if (list.getText().equalsIgnoreCase(this.competition) ||
                    list.getText().equalsIgnoreCase(this.club) ||
                    list.getText().equalsIgnoreCase(this.player)) {
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
                    list.getText().equalsIgnoreCase(this.club) ||
                    list.getText().equalsIgnoreCase(this.player)) {
                price += list.getPrice();
            }
        }
        return price;
    }

    public ArrayList<String> listNews() {
        ArrayList<String> list = new ArrayList<>();

        list.add(super.getHeadline());
        list.add(super.getText());
        list.add(this.competition);
        list.add(this.club);
        list.add(this.player);
        list.add("");
        list.add(String.valueOf(calculatePriceNews()));
        list.add(String.valueOf(calculatePointsNews()));

        return list;
    }

    @Override
    public String toString() {
        return "NewsSoccer{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                "} " + super.toString();
    }
}
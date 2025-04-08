import java.util.ArrayList;

/**
 * PROGRAM: ListsPricesPoints
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class ListsPricesPoints {

    public static void loadTablePricesSoccer() {
        ArrayList<PricesList> list = new ArrayList<>();
        list.add(new PricesList("Lliga de Campions", 100));
        list.add(new PricesList("Barça", 100));
        list.add(new PricesList("Madrid", 100));
        list.add(new PricesList("Ferran Torres", 50));
        list.add(new PricesList("Benzema", 50));

        NewsSoccer.setPricesLists(list);
    }

    public static void loadTablePointsSoccer() {
        ArrayList<PointsList> list = new ArrayList<>();
        list.add(new PointsList("Lliga de Campions", 3));
        list.add(new PointsList("Lliga", 2));
        list.add(new PointsList("Barça", 1));
        list.add(new PointsList("Madrid", 1));
        list.add(new PointsList("Ferran Torres", 1));
        list.add(new PointsList("Benzema", 1));

        NewsSoccer.setPointsList(list);
    }

    public static void loadTablePricesBasket() {
        ArrayList<PricesList> list = new ArrayList<>();
        list.add(new PricesList("Eurolliga", 75));
        list.add(new PricesList("Barça", 75));
        list.add(new PricesList("Madrid", 75));

        NewsBasket.setPricesLists(list);
    }

    public static void loadTablePointsBasket() {
        ArrayList<PointsList> list = new ArrayList<>();
        list.add(new PointsList("Eurolliga", 3));
        list.add(new PointsList("ACB", 2));
        list.add(new PointsList("Barça", 1));
        list.add(new PointsList("Madrid", 1));

        NewsBasket.setPointsList(list);
    }


    public static void loadTablePricesTennis() {
        ArrayList<PricesList> list = new ArrayList<>();
        list.add(new PricesList("Federer", 100));
        list.add(new PricesList("Nadal", 100));
        list.add(new PricesList("Djokovic", 100));

        NewsTennis.setPricesList(list);
    }

    public static void loadTablePointsTennis() {
        ArrayList<PointsList> list = new ArrayList<>();
        list.add(new PointsList("Federer", 3));
        list.add(new PointsList("Nadal", 3));
        list.add(new PointsList("Djokovic", 3));

        NewsTennis.setPointsList(list);
    }

    public static void loadTablePricesF1() {
        ArrayList<PricesList> list = new ArrayList<>();
        list.add(new PricesList("Ferrari", 50));
        list.add(new PricesList("Mercedes", 50));

        NewsF1.setPricesLists(list);
    }

    public static void loadTablePointsF1() {
        ArrayList<PointsList> list = new ArrayList<>();
        list.add(new PointsList("Ferrari", 2));
        list.add(new PointsList("Mercedes", 2));

        NewsF1.setPointsList(list);
    }

    public static void loadTablePricesMotorCycle() {
        ArrayList<PricesList> list = new ArrayList<>();
        list.add(new PricesList("Honda", 50));
        list.add(new PricesList("Yamaha", 50));

        NewsMotorcycling.setPricesList(list);
    }

    public static void loadTablePointsMotorCycle() {
        ArrayList<PointsList> list = new ArrayList<>();
        list.add(new PointsList("Honda", 3));
        list.add(new PointsList("Yamaha", 3));

        NewsMotorcycling.setPointsList(list);
    }
}

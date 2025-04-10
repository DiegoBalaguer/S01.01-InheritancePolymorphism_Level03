import java.util.ArrayList;

/**
 * PROGRAM: MnuOptNewsMain
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class MnuOptNewsMain {

    private static Editor editor = null;

    protected MnuOptNewsMain(Editor editor) {

        this.editor = editor;
        process();

    }

    private static void process() {

        int resp = 0;
        MnuOptNews option = null;

        do {
            MnuOptNews.viewMenu(editor.getName());
            resp = Utils.valueInt("");
            try {
                option = MnuOptNews.values()[resp - 1];
                switch (option) {
                    case EXIT -> {
                        return;
                    }
                    case NEWS_CRE_SO -> newsCreate(Sport.SOCCER);
                    case NEWS_CRE_BA -> newsCreate(Sport.BASKETBALL);
                    case NEWS_CRE_TE -> newsCreate(Sport.TENNIS);
                    case NEWS_CRE_F1 -> newsCreate(Sport.F1);
                    case NEWS_CRE_MO -> newsCreate(Sport.MOTORCYCLING);
                    case NEWS_TYP_TEXT -> newsIntroText();
                    case NEWS_DEL -> newsDelete();
                    case NEWS_LIST -> newsList(editor.getNews());
                    case NEWS_PUNT -> newsPoints();
                    case NEWS_PRICE -> newsPrice();
                    default -> System.out.println("Error: The value is wrong.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }

    private static void newsCreate(Sport sport) {

        System.out.println(System.lineSeparator() + "CREATE " + sport + " ARTICLE .................." + System.lineSeparator());

        String headline = Utils.valueString("Insert headline article: ");

        switch (sport) {
            case SOCCER -> {
                String competition = Utils.valueString("Insert competition: ");
                String club = Utils.valueString("Insert club: ");
                String player = Utils.valueString("Insert player: ");
                NewsSoccer news = new NewsSoccer(headline, competition, club, player);
                editor.setNews(news);
            }
            case BASKETBALL -> {
                String competition = Utils.valueString("Insert competition: ");
                String club = Utils.valueString("Insert club: ");
                NewsBasket news = new NewsBasket(headline, competition, club);
                editor.setNews(news);
            }
            case TENNIS -> {
                String competition = Utils.valueString("Insert competition: ");
                String player = Utils.valueString("Insert player: ");
                NewsTennis news = new NewsTennis(headline, competition, player);
                editor.setNews(news);
            }
            case F1 -> {
                String team = Utils.valueString("Insert team: ");
                NewsF1 news = new NewsF1(headline, team);
                editor.setNews(news);
            }
            case MOTORCYCLING -> {
                String team = Utils.valueString("Insert team: ");
                NewsMotorcycling news = new NewsMotorcycling(headline, team);
                editor.setNews(news);
            }
            default -> System.out.println("Wrong article's type.");
        }
    }

    private static void newsDelete() {

        System.out.println(System.lineSeparator() + "DELETE ARTICLE.................." + System.lineSeparator());

        newsListId(editor.getNews());

        int id = Utils.valueInt("Type article's id to delete: ");

        id--;
        if (!(id >= 0 && id < editor.getNews().size())) {
            System.out.println("The article with id: " + ++id + " not into the system.");
        } else {
            System.out.println(
                    "The article has been deleted from the system: " + System.lineSeparator() + editor.getNews().get(id));
            editor.deleteNews(id);
        }
    }

    private static void newsIntroText() {

        System.out.println(System.lineSeparator() + "TYPE TEXT INTO ARTICLE.................." + System.lineSeparator());

        newsListId(editor.getNews());

        int id = Utils.valueInt("Insert article's id which to insert the text: ");

        id--;
        if (!(id >= 0 && id < editor.getNews().size())) {
            System.out.println("The article's id: " + ++id + " not into the system.");
        } else {
            editor.setTextNews(id, Utils.valueString("Insert article's text: "));
        }
    }

    private static void newsPoints() {
        int p = 0;

        for (News n : editor.getNews()) {
            p += n.calculatePointsNews();
        }
        System.out.println("The overall news' points are: " + p);
    }

    private static void newsPrice() {
        int p = 0;

        for (News n : editor.getNews()) {
            p += n.calculatePriceNews();
        }
        System.out.println("The overall news' price is: " + p + "€");
    }

    private static void newsList(ArrayList<News> list) {
        System.out.println(System.lineSeparator() + "LIST NEWS..................");

        System.out.println(makeFirstNews());

        for (News n : list) {
            System.out.println(makeLineNews(n.listNews()));
        }
    }

    private static void newsListId(ArrayList<News> list) {

        System.out.println(System.lineSeparator() + "LIST NEWS WITH ID...............");

        System.out.println("Index \t" + makeFirstNews());

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ".-  \t" + makeLineNews(list.get(i).listNews()));
        }
    }

    protected static String makeFirstNews() {

        ArrayList<String> l = new ArrayList<>();

        l.add("Headline");
        l.add("Text");
        l.add("Competition");
        l.add("Club");
        l.add("Player");
        l.add("Team");
        l.add("Price");
        l.add("Points");

        return makeLineNews(l);
    }

    protected static String makeLineNews(ArrayList<String> w) {

        int i = 0;

        return Utils.formatToChars(w.get(i++), 20) + " \t " +
                Utils.formatToChars(w.get(i++), 10) + " \t " +
                Utils.formatToChars(w.get(i++), 15) + " \t " +
                Utils.formatToChars(w.get(i++), 10) + " \t " +
                Utils.formatToChars(w.get(i++), 15) + " \t " +
                Utils.formatToChars(w.get(i++), 10) + " \t " +
                Utils.formatToChars(w.get(i++), 8) + " \t " +
                Utils.formatToChars(w.get(i), 8);
    }
}
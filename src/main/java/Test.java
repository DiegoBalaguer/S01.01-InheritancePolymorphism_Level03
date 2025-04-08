import java.util.ArrayList;

/**
 * PROGRAM: Test
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class Test {
    public static ArrayList<Editor> editorsLoad() {
        ArrayList<Editor> editors = new ArrayList<>();

        Editor e;
        NewsSoccer soccer;
        NewsBasket basket;
        NewsTennis tennis;
        NewsF1 f1;
        NewsMotorcycling cycle;

        e = new Editor("Bob Woodward", "12345678X");
        soccer = new NewsSoccer("News soccer 01", "Lliga de campions", "Barça", "Ferran Torres");
        e.setNews(soccer);
        soccer = new NewsSoccer("News soccer 02", "Lliga", "Barça", "player");
        e.setNews(soccer);
        basket = new NewsBasket("News Basket 01", "Eurolliga", "Madrid");
        e.setNews(basket);
        tennis = new NewsTennis("News Tennis 01", "Madrid", "Nadal");
        e.setNews(tennis);
        f1 = new NewsF1("News F1 01", "Ferrari");
        e.setNews(f1);
        cycle = new NewsMotorcycling("News Motorcycling 01", "Honda");
        e.setNews(cycle);
        editors.add(e);

        e = new Editor("Carl Bernstein", "23456789Y");
        soccer = new NewsSoccer("News soccer 03", "Lliga de campions", "Barça", "Ferran Torres");
        e.setNews(soccer);
        soccer = new NewsSoccer("News soccer 04", "Lliga", "Barça", "player");
        e.setNews(soccer);
        basket = new NewsBasket("News Basket 02", "Eurolliga", "Madrid");
        e.setNews(basket);
        tennis = new NewsTennis("News Tennis 02", "Madrid", "Nadal");
        e.setNews(tennis);
        f1 = new NewsF1("News F1 02", "Ferrari");
        e.setNews(f1);
        cycle = new NewsMotorcycling("News Motorcycling 02", "Honda");
        e.setNews(cycle);
        editors.add(e);

        e = new Editor("Joseph Pulitzer", "34567890Z");
        editors.add(e);
        e = new Editor("Ida B. Wells", "45678901A");
        editors.add(e);
        e = new Editor("Horace Greeley", "56789012B");
        editors.add(e);
        e = new Editor("Nellie Bly", "67890123C");
        editors.add(e);
        e = new Editor("William Randolph Hearst", "78901234D");
        editors.add(e);
        e = new Editor("Anna Politkóvskaya", "89012345E");
        soccer = new NewsSoccer("News soccer 05", "Lliga de campions", "Barça", "Ferran Torres");
        e.setNews(soccer);
        soccer = new NewsSoccer("News soccer 06", "Lliga", "Barça", "player");
        e.setNews(soccer);
        basket = new NewsBasket("News Basket 03", "Eurolliga", "Madrid");
        e.setNews(basket);
        tennis = new NewsTennis("News Tennis 03", "Madrid", "Nadal");
        e.setNews(tennis);
        f1 = new NewsF1("News F1 03", "Ferrari");
        e.setNews(f1);
        cycle = new NewsMotorcycling("News Motorcycling 03", "Honda");
        e.setNews(cycle);
        editors.add(e);

        e = new Editor("Hunter S. Thompson", "90123456F");
        editors.add(e);
        e = new Editor("David Halberstam", "01234567G");
        editors.add(e);

        return editors;
    }
}

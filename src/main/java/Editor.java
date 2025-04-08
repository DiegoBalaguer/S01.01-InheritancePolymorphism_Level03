import java.util.ArrayList;

/**
 * PROGRAM: Editor
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class Editor {

    private String name;
    private final String dni;
    private static double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        setName(name);
        this.dni = setDni(dni);
        news = new ArrayList<>();
    }

    private void setName(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to name.");
        } else
            this.name = r;
    }

    private String setDni(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to dni.");
        } else
            return r;
    }

    public static void setSalary(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("The salary must be equal or greater than 1€.");
        } else
            salary = r;
    }

    public String getName() {
        return name;
    }

    public void setNews(News r) {
        this.news.add(r);
    }

    public void deleteNews(int id) {
        this.news.remove(id);
    }

    public ArrayList<News> getNews() {
        return news;
    }

    public void setTextNews(int id, String r) {
        News n = news.get(id);
        n.setText(r);
    }

    public int calculatePointsNews() {

        int p = 0;

        for (News n : news) {
            p += n.calculatePointsNews();
        }
        return p;
    }

    public double calculatePriceNews() {

        double p = 0;

        for (News n : news) {
            p += n.calculatePriceNews();
        }
        return p;
    }

    public ArrayList<String> listEditor() {
        ArrayList<String> list = new ArrayList<>();

        list.add(this.name);
        list.add(this.dni);
        list.add(String.valueOf(salary));
        list.add(String.valueOf(calculatePointsNews()));
        list.add(String.valueOf(calculatePriceNews()));

        return list;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", news=" + news +
                '}';
    }
}

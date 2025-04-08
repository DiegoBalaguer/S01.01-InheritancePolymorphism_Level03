
/**
 * PROGRAM: PricesList
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class PricesList {
    private String text;
    private double price;

    public PricesList(String text, double price) {
        setText(text);
        setPrice(price);
    }

    private void setText(String r) {
        if (r.isBlank()) {
            throw new IllegalArgumentException("An empty string can not be assigned to text.");
        } else
            this.text = r;
    }

    private void setPrice(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("The price must be equal or greater than 1€.");
        } else
            this.price = r;
    }

    public String getText() {
        return text;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PricesBoard{" +
                "text='" + text + '\'' +
                ", price=" + price +
                '}';
    }
}

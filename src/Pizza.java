public class Pizza extends Product implements Discountable {
    private String size;

    public Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return "Pizza " + name + " (" + size + ") - " + price + " UAH";
    }

    @Override
    public double applyDiscount(double percent) {
        return price - (price * percent / 100.0);
    }
}

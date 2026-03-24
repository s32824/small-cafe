import java.util.Objects;
public class MenuItem {
    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount = 0;

    public MenuItem(String code, String name, double price, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        productCount++;
    }

    public static int getProductCount() { return productCount; }
    public double getPrice() { return price; }
    public String getCode() { return code; }

    @Override
    public String toString() {
        return String.format("[%s] %s - %.2f PLN (%s)", code, name, price, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem other = (MenuItem) o;
        return Objects.equals(this.code, other.code);
    }
}
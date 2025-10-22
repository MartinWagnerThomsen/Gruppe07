package Harry;

public class Product {
    private int productId;
    private String name;
    private double price;
    private ProductCategory category;

    // Constructor
    public Product(int productId, String name, double price, ProductCategory category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public int getProductId() {return productId;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public ProductCategory getCategory() {return category;}  // RETTET: Kun én getter

    // Setters
    public void setProductId(int productId) {this.productId = productId;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setCategory(ProductCategory category) {this.category = category;}

    // Formateret produkt info
    public String getProductInfo() {
        return "Product ID: " + productId +
                "\nName: " + name +
                "\nPrice: " + String.format("%.2f", price) + " DKK" +
                "\nCategory: " + category;
    }

    @Override
    public String toString(){
        return name + " - " + String.format("%.2f", price) + " DKK (" + category + ")";
    }
}
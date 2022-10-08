public class Product {

    private int id;  // ürünü tanımlayan eşsiz değerdir.
    private String name;
    private String desc;
    private double price;
    private int stock;

    private String kod;

    public Product() {
    }

    public Product(int id, String name, String desc, double price, int stock) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.stock = stock;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getKod() {
        return this.name.substring(0,1) + this.id;
    }

}

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();

        Product product = new Product();

        product.name="laptop";
        product.id=1;
        product.price=30000;

        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.update();

    }
}

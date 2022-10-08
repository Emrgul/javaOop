public class Main {

    public static void main(String[] args) {

        Product product = new Product(1,"laptop","asus",2000,3);

//        product.setName("laptop");
//        product.getId();
//        product.setId(1);
//        product.setDesc("Asus laptop");
//        product.setPrice(23000);
//        product.setStock(2);

        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.ekle(product);

    }
}

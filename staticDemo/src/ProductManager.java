public  class ProductManager {

    public void add(Product product){
       // ProductValidator productValidator = new ProductValidator();
        // biz burada newlemek yerine static kullanarak yapabiliriz.

        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("eklenemedi");
        }

    }

}

public class Main {

    //javada iş yapan her şey classtır.
    public static void main(String[] args) {

        //örnek oluşturacağım demek customer manager türünde bir kullanım yapacağım demektir.
        CustomerManager customerManager = new CustomerManager();
        // bunu yaptığımız an biz bellekte customer manager türünde bellekte bir nesne üretmiş oluyoruz.
        // Classlar referans tiptir !!!!!!!!

        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

    }
}

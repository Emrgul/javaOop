public class Main {

    public static void main(String[] args) {

        //fonksiyon yazarak kendimizi tekrarlamaya engel olmuş oluyoruz.
        sayiBulmaca();


    }

    public static void sayiBulmaca() {

        int a = 5;
        int b = 3;

        if (a > b) {
            mesajVer(a);
        }

    }

// Burada bana int türünde a ver diyorum.
    public static void mesajVer(int a){
        System.out.println(a + " " + "sayısı buyuk sayidir");
    }
}

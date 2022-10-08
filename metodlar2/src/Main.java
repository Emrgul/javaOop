public class Main {

    public static void main(String[] args) {
        int sayi=topla(5,7);
        int toplam=topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }

    //void emir kipi gibidir.
    //ben metoda ne eklediysem o datayı bana geri ver durumu da olabilir.(return)
    //void ile yapılmaz return !!!
    //void bize sonuç olarak hiçbir şey vermez.

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("güncellendi");
    }

    //Bu fonksiyon int türünde bir değer döndürür demektir.
    public static int topla(int a , int b){
        return a+b;
    }

    //arka planda bunu bir dizi haline getirir.
    public static int topla2(int... sayilar){

        int toplam=0;
        for(int sayi:sayilar) {
           toplam+=sayi;
        }
        return toplam;

    }

    public static String sehirVer(){
        return "ankara";
    }
}

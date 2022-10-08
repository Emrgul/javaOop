public class Main {

    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        int sonuc;

        sonuc = hesapMakinesi.topla(3,5);
        System.out.println(sonuc);

        sonuc=hesapMakinesi.cikar(4,10);
        System.out.println(sonuc);

        sonuc=hesapMakinesi.carp(5,3);
        System.out.println(sonuc);

        sonuc=hesapMakinesi.bol(20,20);
        System.out.println(sonuc);

    }
}

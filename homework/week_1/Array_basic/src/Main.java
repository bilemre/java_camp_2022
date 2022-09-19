public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Emre";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Ahmet";
        ogrenciler[3] = "Ali";

        System.out.println(ogrenciler[0]);
        System.out.println(ogrenciler[1]);
        System.out.println(ogrenciler[2]);
        System.out.println(ogrenciler[3]);
        System.out.println("__________________");
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);

        }
        System.out.println("_________________");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
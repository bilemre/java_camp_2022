public class Main {
    public static void main(String[] args) {

        String [][] Citys = new String[3][3];

        Citys[0][0] ="İstanbul";
        Citys[0][1] ="Bursa";
        Citys[0][2] ="Bilecik";
        Citys[1][0] ="Ankara";
        Citys[1][1] ="Konya";
        Citys[1][2] ="Kayseri";
        Citys[2][0] ="Diyarbakır";
        Citys[2][1] ="Şanlıurfa";
        Citys[2][2] ="Gaziantep";

        for (int i = 0; i <=2 ; i++) {
            System.out.println("--------------------");
            for (int j = 0 ;j<=2;j++){
                System.out.println(Citys[i][j]);
            }
        }

    }
}
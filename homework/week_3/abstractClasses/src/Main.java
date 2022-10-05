public class Main {
    public static void main(String[] args) {
    WomenGameCalculater womenGameCalculater = new WomenGameCalculater();

    GameCalculater gameCalculater = new WomenGameCalculater();

    womenGameCalculater.calculate();
    womenGameCalculater.gameOver();

    gameCalculater.calculate();

    }
}
/*                    OUTPUT
                     Score : 95
                     Game Over!
                     Score : 95
*/
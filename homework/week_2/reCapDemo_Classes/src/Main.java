public class Main {
    public static void main(String[] args) {

        FourTransactions process = new FourTransactions();

        System.out.println("Result : "+process.addition(5,15));
        System.out.println("Result : "+process.extraction(10,5));
        System.out.println("Result : "+process.multiplication(10,5));
        System.out.println("Result : "+process.division(10,5));
    }
}

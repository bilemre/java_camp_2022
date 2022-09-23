public class Main {
    public static void main(String[] args) {

        Transactions transactions = new Transactions();

        System.out.println("Total : "+transactions.addition(5,6));
        System.out.println("Total : "+transactions.addition(5,6,7));
    }

    /*  OUTPUT :

    Total : 11
    Total : 18
     */
}

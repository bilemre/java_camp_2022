import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        
    int number = 10;
    boolean isPrime = true;

    if (number <1 ){
        System.out.println("invalid Number");
        return;
    }
    else if(number == 1){
        System.out.println("Number is not Prime");
        return;
    }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
            }


        }
        if(isPrime){
            System.out.println("Number is Prime");
        }
        else
            System.out.println("Number is not Prime");




    }
}
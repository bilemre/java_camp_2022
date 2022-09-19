

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15,12,33,654,34};
        int search = 18;
        boolean status = false;

        for (int i = 0; i <4 ; i++) {
            if(numbers[i] == search)
                status = true;
            break;
        }

       if(status){
           System.out.println("There are "+search + " number");
       }
       else
       {
           System.out.println("There aren't "+search + " number");
       }

    }
}
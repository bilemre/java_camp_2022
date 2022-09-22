public class Main {
    public static void main(String[] args) {
        findNumber();
        findNumber();
        findNumber();
        findNumber();

    }

    // *** methods are written in camelCase type ***
    public static void findNumber(){
        int[] numbers = {15,12,33,654,34};
        int search = 11;
        boolean status = false;

        for (int i = 0; i <4 ; i++) {
            if(numbers[i] == search)
                status = true;
            break;
        }

        if(status){

            writeMessage("There are "+search + " number");
        }
        else
        {
            writeMessage("There aren't " +search +  "number");
        }

    }

    public static void writeMessage(String message){
        System.out.println(message);
    }

}

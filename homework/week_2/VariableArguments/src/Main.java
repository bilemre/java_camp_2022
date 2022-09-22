public class Main {
    public static void main(String[] args) {

        System.out.println("Total : "+addition(1,2,3,4));

    }

    public static int addition(int... numbers){
        int total = 0;
        for (int number:numbers){

            total+=number;
        }
        return total;
    }
}

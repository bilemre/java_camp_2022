public class Main {
    public static void main(String[] args) {

        double[] MyList = {1.2,1.3,3.4,5.4};
        double total = 0;
        double max =  MyList[0];

        for (double number:MyList){
            if(max<number)
            {
                max = number;
            }
            System.out.println(number);
            total+=number;
        }

        System.out.println("Total : "+total);
        System.out.println("Max Number : "+max);

    }
}
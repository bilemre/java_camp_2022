public class Main {
    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{
                new AgricultureCreditManager(),new StudentCreditManager(),new TeacherCreditManager()
        };

        for (BaseCreditManager creditManager:creditManagers){
            System.out.println(creditManager.calculate(1000));
        }

    }
}
/*                                  OUTPUT
                                    1180.0
                                    1100.0
                                    1180.0
    



 */

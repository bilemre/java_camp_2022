public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        AgriculturalCreditManager agriculturalCreditManager = new AgriculturalCreditManager();

        creditUI.calculateLoan(agriculturalCreditManager);
        creditUI.calculateLoan(new SoldierCreditManager());
    }
}

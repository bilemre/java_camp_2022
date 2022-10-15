public class CustomerManager{

    private  Customer customer;
    private ICreditManager creditManager;




    public CustomerManager(ICreditManager creditManager) {
        this.creditManager = creditManager;
    }

    public void  save(){
        System.out.println("Müşteri kaydedildi. ");
    }
    public void  delete(){
        System.out.println("Müşteri silindi. ");
    }

    public void  giveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi.");
        creditManager.save();
    }
}

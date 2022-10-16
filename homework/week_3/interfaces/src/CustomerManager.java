public class CustomerManager {

ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
    this.customerDal = customerDal;

    }


    public void add(){
    customerDal.add();
    }
}

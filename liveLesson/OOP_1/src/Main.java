import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.getDiscount(7);
        product1.getUnitPrice(7500);
        product1.getUnitInStock(3);
        product1.getImageUrl("deneme1.çjpg");

        Product product2 = new Product();

        product2.setName("Kitchen Kahve Makinesi");
        product2.getDiscount(9);
        product2.getUnitPrice(4500);
        product2.getUnitInStock(5);
        product2.getImageUrl("deneme1.çjpg");

        Product product3 = new Product();

        product3.setName("Delonghi Kahve Makinesi");
        product3.getDiscount(4);
        product3.getUnitPrice(3500);
        product3.getUnitInStock(1);
        product3.getImageUrl("deneme1.çjpg");

        Product[] products ={product1,product2,product3};
        System.out.println("<ul>");
        for(Product product:products){
            System.out.println(product.getName());
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("055555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Emre");
        individualCustomer.setLastName("Bil");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhoneNumber("05333333");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer,corporateCustomer};


            for(Customer customer1:customers){
                System.out.println("Id : "+customer1.getId());
                System.out.println("Phone Number : "+customer1.getPhoneNumber());
                System.out.println("Customer Number : "+customer1.getCustomerNumber());

            }
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setId(1);
        product.setName("Laptop");
        product.setColor("Black");
        product.setDescription("Laptop Description");
        product.setPrice(5000);
        product.setStockAmount(2);

        System.out.println("id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Color : " + product.getColor());
        System.out.println("Description : " + product.getDescription());
        System.out.println("Price : " + product.getPrice());
        System.out.println("Stock Amount : " + product.getStockAmount());
        System.out.println("Code : " + product.getCode());
    }

    /*


    Output
    
    id : 1
    Name : Laptop
    Color : Black
    Description : Laptop Description
    Price : 5000
    Stock Amount : 2
    Code : L1



     */
}

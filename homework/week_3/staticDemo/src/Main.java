public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();

        product.name="Mouse";
        product.price=10;


        productManager.add(product);


        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Crud.Connection.CreateConnection();

    }
}


// PascalCase ->> EmreBil
// camelCase ->>  emreBil
public class Product {
   private String name;
    private int unitPrice;
    private int discount;
    private int unitInStock;

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice(int unitPrice) {
        return unitPrice;
    }

    public int getDiscount(int discount) {
        return discount;
    }

    public int getUnitInStock(int unitInStock) {
        return unitInStock;
    }

    public String getImageUrl(String imageUrl) {
        return imageUrl;
    }

    private String imageUrl;
}

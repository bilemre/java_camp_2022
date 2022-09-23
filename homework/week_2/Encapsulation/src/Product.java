public class Product {
    private String name;
    private int id;
    private String description;
    private int price;
    private int stockAmount;
    private String color;
    private String code;


    // getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return name.substring(0,1)+id;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

public class Product {



        private String description;
        private int price;
        private int stockAmount;
        private String color;
        private String code;

        public Product(){
            System.out.println("Constructor Field");
        }


        public Product(String name ,int id ,String description,int price,int stockAmount,String color){
        this.name=name;
        this.id=id;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.color= color;
        }


        private String name;
        private int id;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
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

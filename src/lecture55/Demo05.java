package lecture55;

public class Demo05 {
    public static void main(String[] args) {
        class Product{
            int prodId;
            String productName;
            int prodPrice;

            Product(int id, String name, int price){
                this.prodId = id;
                this.productName = name;
                this.prodPrice = price;
            }

            @Override
            public String toString() {
                return "    id      " + prodId + "  name    " + productName + "     price   " + prodPrice;
            }
        }

        Product product = new Product(1, "Laptop", 55666);
        System.out.println(product);

        Object o = new Product(2, "Mobile", 15000);
        System.out.println(o);
    }
}

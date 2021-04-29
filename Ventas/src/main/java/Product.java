public class Product {

    private int price;
    private  int quantity;

    public Product(int price) {
        this.price = price;
        this.quantity = 0;
    }

    public int getTotalProductPrice() {
        return this.price*this.quantity;
    }

    public void increaseProductQuantity(int productQuantity) {
        this.quantity += productQuantity;
    }


}

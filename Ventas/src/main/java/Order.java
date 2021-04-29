public class Order {
    private static int totalPrice = 0;
    public static int getTotalOrderPrice() {
        return totalPrice;
    }
    public static void increaseTotal(int totalProductPrice){
        totalPrice+=totalProductPrice;
    }
}

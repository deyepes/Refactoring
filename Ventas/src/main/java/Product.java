public class Product {

    public static void getTotalPrice(int totalPriceHamburgesasBought, int totalPricePerrosBought) {
        int totalPrice = totalPriceHamburgesasBought + totalPricePerrosBought;
        System.out.println("Total: " + totalPrice);
    }

    public static int sellProduct(int price, int cuantity){
        return price*cuantity;
    }

}

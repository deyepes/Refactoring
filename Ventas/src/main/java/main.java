import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int perroPrice = 6000, hamburguesaPrice = 10000, perroCuantityToBuy = 0, hamburguesaCuantityToBuy = 0,
                productSelecction = 0, cuantityProductSelection, endSale = 0, totalPrice, totalPricePerrosBought = 0,
                totalPriceHamburgesasBought = 0;

        boolean takeOrder = true;
        Scanner takeOrders = new Scanner(System.in);

        System.out.println("Venta de perros y hamburguesas");

        while (takeOrder) {
            productSelecction = TakeOrders.productToSell(takeOrders);
            cuantityProductSelection = TakeOrders.cuantityToSell(takeOrders);
            if (productSelecction == 1) {
                perroCuantityToBuy +=  cuantityProductSelection;
            } else if (productSelecction== 2) {
                hamburguesaCuantityToBuy +=  cuantityProductSelection;
            } else {
                break;
            }
            endSale = TakeOrders.takeMoreOrders(takeOrders);
            if (endSale == 1) {
                takeOrder = true;
            } else if (endSale == 2) {
                takeOrder = false;
            } else {
                break;
            }
        }

        totalPriceHamburgesasBought = Product.sellProduct(hamburguesaPrice,hamburguesaCuantityToBuy);
        totalPricePerrosBought = Product.sellProduct(perroPrice,perroCuantityToBuy);
        Product.getTotalPrice(totalPriceHamburgesasBought,totalPricePerrosBought);
    }

}

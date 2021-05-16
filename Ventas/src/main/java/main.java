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
            productSelecction = productToSell(takeOrders);
            cuantityProductSelection = cuantityToSell(takeOrders);
            if (productSelecction == 1) {
                perroCuantityToBuy +=  cuantityProductSelection;
            } else if (productSelecction== 2) {
                hamburguesaCuantityToBuy +=  cuantityProductSelection;
            } else {
                break;
            }
            endSale = takeMoreOrders(takeOrders);
            if (endSale == 1) {
                takeOrder = true;
            } else if (endSale == 2) {
                takeOrder = false;
            } else {
                break;
            }
        }

        totalPriceHamburgesasBought = sellProduct(hamburguesaPrice,hamburguesaCuantityToBuy);
        totalPricePerrosBought = sellProduct(perroPrice,perroCuantityToBuy);
        getTotalPrice(totalPriceHamburgesasBought,totalPricePerrosBought);
    }

    private static void getTotalPrice(int totalPriceHamburgesasBought, int totalPricePerrosBought) {
        int totalPrice = totalPriceHamburgesasBought + totalPricePerrosBought;
        System.out.println("Total: " + totalPrice);
    }

    public static int takeMoreOrders(Scanner takeOrders){
        System.out.println("Desea finalizar o agregar otro producto ?");
        System.out.println("1. Agregar \n2. Finalizar");
        return Integer.parseInt(takeOrders.nextLine());
    }
    private static int productToSell(Scanner takeOrders){
        System.out.println("Seleccione producto: ");
        System.out.println("1. Perro \n2. Hamburguesa");
        return Integer.parseInt(takeOrders.nextLine());
    }
    private static int cuantityToSell(Scanner takeOrders){
        System.out.println("Indique cantidad: ");
        return Integer.parseInt(takeOrders.nextLine());
    }

    private static int sellProduct(int price, int cuantity){
        return price*cuantity;
    }

}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int perroPrice = 6000, hamburguesaPrice = 10000, perroCuantityToBuy = 0, hamburguesaCuantityToBuy = 0,
                productSelecction = 0, cuantityProductSelection, endSale = 0, totalPrice, totalPricePerrosBought = 0, totalPriceHamburgesasBought = 0;

        boolean takeOrder = true;
        Scanner takeOrders = new Scanner(System.in);

        System.out.println("Venta de perros y hamburguesas");

        while (takeOrder) {

            System.out.println("Seleccione producto: ");
            System.out.println("1. Perro \n2. Hamburguesa");
            productSelecction = Integer.parseInt(takeOrders.nextLine());
            System.out.println("Indique cantidad: ");
            cuantityProductSelection = Integer.parseInt(takeOrders.nextLine());
            if (productSelecction == 1) {
                perroCuantityToBuy = perroCuantityToBuy + cuantityProductSelection;
            } else if (productSelecction == 2) {
                hamburguesaCuantityToBuy = hamburguesaCuantityToBuy + cuantityProductSelection;
            } else {
                break;
            }
            System.out.println("Desea finalizar o agregar otro producto ?");
            System.out.println("1. Agregar \n2. Finalizar");
            endSale = Integer.parseInt(takeOrders.nextLine());
            if (endSale == 1) {
                takeOrder = true;
            } else if (endSale == 2) {
                takeOrder = false;
            } else {
                break;
            }
        }

        totalPriceHamburgesasBought = hamburguesaPrice * hamburguesaCuantityToBuy;
        totalPricePerrosBought = perroPrice * perroCuantityToBuy;
        totalPrice = totalPriceHamburgesasBought + totalPricePerrosBought;
        System.out.println("Total: " + totalPrice);
    }
}

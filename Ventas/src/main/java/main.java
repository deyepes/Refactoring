import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int hotDogValue = 6000, hamburgerValue = 10000, hotDogSellQuantity = 0, hamburgerSellQuantity = 0, selectedProduct = 0, productQuantity, endOrder = 0, totalOrderPrice, totalHotDogPrice = 0, totalHamburgerPrice = 0;

        boolean isOrderActive = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Venta de perros y hamburguesas");

        while (isOrderActive) {

            System.out.println("Seleccione producto: ");
            System.out.println("1. Perro \n2. Hamburguesa");
            selectedProduct = Integer.parseInt(input.nextLine());
            System.out.println("Indique cantidad: ");
            productQuantity = Integer.parseInt(input.nextLine());
            if (selectedProduct == 1) {
                hotDogSellQuantity = hotDogSellQuantity + productQuantity;
            } else if (selectedProduct == 2) {
                hamburgerSellQuantity = hamburgerSellQuantity + productQuantity;
            } else {
                break;
            }
            System.out.println("Desea finalizar o agregar otro producto ?");
            System.out.println("1. Agregar \n2. Finalizar");
            endOrder = Integer.parseInt(input.nextLine());
            if (endOrder == 1) {
                isOrderActive = true;
            } else if (endOrder == 2) {
                isOrderActive = false;
            } else {
                break;
            }
        }

        totalHamburgerPrice = hamburgerValue * hamburgerSellQuantity;
        totalHotDogPrice = hotDogValue * hotDogSellQuantity;
        totalOrderPrice = totalHamburgerPrice + totalHotDogPrice;
        System.out.println("Total: " + totalOrderPrice);
    }
}

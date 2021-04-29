import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int selectedProduct = 0, productQuantity, endOrder = 0;
        Product hotDog = new Product(6000);
        Product hamburger = new Product(10000);
        boolean isOrderActive = true;
        Scanner input = new Scanner(System.in);

        printMessage("Venta de perros y hamburguesas");

        while (isOrderActive) {

            printMessage("Seleccione producto: ");
            printMessage("1. Perro \n2. Hamburguesa");
            selectedProduct = Integer.parseInt(input.nextLine());

            printMessage("Indique cantidad: ");
            productQuantity = Integer.parseInt(input.nextLine());

            if (selectedProduct == 1) {
                hotDog.increaseProductQuantity(productQuantity);
            } else if (selectedProduct == 2) {
                hamburger.increaseProductQuantity(productQuantity);
            } else {
                break;
            }

            printMessage("Desea finalizar o agregar otro producto ?");
            printMessage("1. Agregar \n2. Finalizar");
            endOrder = Integer.parseInt(input.nextLine());

            if (endOrder == 1) {
                isOrderActive = true;
            } else if (endOrder == 2) {
                isOrderActive = false;
            } else {
                break;
            }
        }

        Order.increaseTotal(hotDog.getTotalProductPrice());
        Order.increaseTotal(hamburger.getTotalProductPrice());
        printMessage("Total: " + Order.getTotalOrderPrice());
    }
    private static void printMessage(String message){
        System.out.println(message);
    }

}

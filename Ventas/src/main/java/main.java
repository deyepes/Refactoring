import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int hotDogValue = 6000, hamburgerValue = 10000, hotDogSellQuantity = 0, hamburgerSellQuantity = 0, selectedProduct = 0, productQuantity, endOrder = 0, totalOrderPrice, totalHotDogPrice = 0, totalHamburgerPrice = 0;

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
                hotDogSellQuantity = getProductSellQuantity(hotDogSellQuantity, productQuantity);
            } else if (selectedProduct == 2) {
                hamburgerSellQuantity = getProductSellQuantity(hamburgerSellQuantity, productQuantity);
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

        totalHamburgerPrice = getTotalProductPrice(hamburgerValue, hamburgerSellQuantity);
        totalHotDogPrice = getTotalProductPrice(hotDogValue, hotDogSellQuantity);
        totalOrderPrice = getTotalOrderPrice(totalHotDogPrice, totalHamburgerPrice);
        printMessage("Total: " + totalOrderPrice);
    }

    private static int getProductSellQuantity(int productSellQuantity, int productQuantity) {
        return productSellQuantity + productQuantity;
    }

    private static int getTotalOrderPrice(int totalHotDogPrice, int totalHamburgerPrice) {
        return totalHamburgerPrice + totalHotDogPrice;
    }

    private static int getTotalProductPrice(int productValue,int productQuantity) {
        return productValue*productQuantity;
    }

    private static void printMessage(String message){
        System.out.println(message);
    }


}

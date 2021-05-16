import java.util.Scanner;

public class TakeOrders {
    public static int takeMoreOrders(Scanner takeOrders){
        System.out.println("Desea finalizar o agregar otro producto ?");
        System.out.println("1. Agregar \n2. Finalizar");
        return Integer.parseInt(takeOrders.nextLine());
    }
    public static int productToSell(Scanner takeOrders){
        System.out.println("Seleccione producto: ");
        System.out.println("1. Perro \n2. Hamburguesa");
        return Integer.parseInt(takeOrders.nextLine());
    }
    public static int cuantityToSell(Scanner takeOrders){
        System.out.println("Indique cantidad: ");
        return Integer.parseInt(takeOrders.nextLine());
    }
}

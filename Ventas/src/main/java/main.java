import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int precioPerro = 6000, precioHamburguesa = 10000, cantidadPerro = 0, cantidadHamburguesa = 0, productoSeleccionado = 0, cantidad, operacionSiguiente = 0, totalVenta, totalPerro = 0, totalHamburguesa = 0;

        boolean continuarCompra = true;
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.println("Venta de perros y hamburguesas");

        while (continuarCompra) {

            proSel = Selector.getProSel(entradaEscaner);
            System.out.println("Indique cantidad: ");
            cantidad = Integer.parseInt(entradaEscaner.nextLine());
            if (productoSeleccionado == 1) {
                cantidadPerro = cantidadPerro + cantidad;
            } else if (productoSeleccionado == 2) {
                cantidadHamburguesa = cantidadHamburguesa + cantidad;
            } else {
                break;
            }
            selFin = Selector.getSelFin(entradaEscaner);
            if (selFin == 1) {
                initTrans = true;
            } else if (selFin == 2) {
                initTrans = false;
            } else {
                break;
            }
        }

        totalHamburguesa = precioHamburguesa * cantidadHamburguesa;
        totalPerro = precioPerro * cantidadPerro;
        totalVenta = totalHamburguesa + totalPerro;
        System.out.println("Valor a pagar: " + totalVenta);
    }

}

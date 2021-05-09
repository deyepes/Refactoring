public class Selector {

    private static int getSelFin(Scanner entradaEscaner) {
        int selFin;
        System.out.println("Desea finalizar o agregar otro producto ?");
        System.out.println("1. Agregar \n2. Finalizar");
        selFin = Integer.parseInt(entradaEscaner.nextLine());
        return selFin;
    }

    private static int getProSel(Scanner entradaEscaner) {
        int proSel;
        System.out.println("Seleccione producto: ");
        System.out.println("1. Perro \n2. Hamburguesa");
        proSel = Integer.parseInt(entradaEscaner.nextLine());
        return proSel;
    }
}
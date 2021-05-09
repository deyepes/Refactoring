public class Operacion {


    public Operacion() {
        throw new IllegalStateException("Utility class");
    }

    public static int sumarLosValores(int x, int y) {
        return x + y;
    }

    public static int restaLosValores(int x, int y){
        return x - y;
    }

    public static int multipliqueLosValores(int x, int y) {
        return x * y;
    }

    public static int dividaLosValores(int x, int y){ return x/y;}

    public static double sumaDecimales(double x, double y){ return x+y;}
}

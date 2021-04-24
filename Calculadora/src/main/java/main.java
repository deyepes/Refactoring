public class main {

    public static void main(String args[]){

        int x=5;
        int y=6;
        print_result(Operation.add(x, y));
        print_result(Operation.substract(x, y));
    }
    public static void print_result(int z){
        System.out.println("The result of the operation is: "+z);
    }
}

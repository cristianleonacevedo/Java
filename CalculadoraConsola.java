import java.util.Scanner;
public class CalculadoraConsola {
    public static double LeerNumero1(String Mensaje) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el valor del primer numero:");
        double n1 = scan.nextDouble();
        return n1;
    }

    public static double LeerNumero2(String Mensaje) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el valor del segundo numero:");
        double n2 = scan.nextDouble();
        scan.close();
        return n2;
    }

    public static String LeerOperacion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la operacion deseada: ");
        String op = scan.nextLine();
        scan.close();
        return op;
    }

    public static void calculador(double a, double b, String op) {
    
    }

    public static double MostrarResultado(double resultado) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("----- menu principal -----");
        System.out.println("");
        System.out.println("Digita los numeros que quieras utilizar (solo dos)");

        LeerNumero1(null);
        LeerNumero2(null);
        System.out.println("");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("");
        String op = LeerOperacion();

    }
}

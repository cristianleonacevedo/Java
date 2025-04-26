import java.util.Random;
import java.util.Scanner;

public class ArrayAleatorio {
    public static int[] generarArray(int n, int maxValor){
        Random r = new Random();
        int [] aleN = new int[n];
        for (int i = 0; i < n; i++) {
            aleN[i] = r.nextInt(maxValor);
        }
        return aleN;
    }

    public static double mediaA(int aleN[]) {
        double sumar = 0;
        for(int i = 0; i < aleN.length; i++) {
            sumar = 0 + aleN[i];
        }
        double media = sumar / aleN.length;
        return media;
    }

    public static int mayor(int aleN[]) {
        int max = aleN[0];
        for (int i = 0; i < aleN.length; i++){
            if (max < aleN[i]) {
                max = aleN[i];
            }
        }
         return max;
        
    }

    public static int menor(int aleN[]) {
        int menor = mayor(aleN);
        for (int i = 0; i < aleN.length; i++){
            if (menor > aleN[i]) {
                menor = aleN[i];
            }
        }
         return menor;
        
    }


    public static void main(String [] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Cual quieres que sea el limite del array?");
        int limit = scann.nextInt(); 
        System.out.println("");
        System.out.println("Cual quieres que sea el limite de los numeros generados?");
        int maxi = scann.nextInt();
        int []aleator = generarArray(limit, maxi);
        double media = mediaA(aleator);

        System.out.print("La media aritmetica es: ");
        System.out.println(media);
        System.out.println("");
        int max = mayor(aleator);
        System.out.print("El numero mayor del array es: ");
        System.out.println(max);
        System.out.print("El numero menor del array es: ");
        int menor = menor(aleator);
        System.out.println(menor);
        scann.close();

    }
}

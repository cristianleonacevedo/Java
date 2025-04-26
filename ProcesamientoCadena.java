import java.util.Scanner;

public class ProcesamientoCadena {

    public static char[] LeerCadena(String Mensaje) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String pal = scann.nextLine();
        char [] palab = pal.toCharArray();
        scann.close();
        return palab;
    }
    public static char[] vocales() {
        String vocal = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        char [] vocales = vocal.toCharArray();
        return vocales;
    }

    public static int contarVocales(String [] vocales, String palab) {
        int vocalesc = 0;
        for(int i = 0; i < palab.length(); i++ )
            if (palab[i] == vocales[i]) {
                vocalesc += 1;
            }
        return vocalesc;
    }

    public static String Revez(String palab) {
        String palabra = "";
        for (int i = palab.length(); i == 0; i--){
            palabra += palab[i];
        }
        return palabra;
    }

    public static void main(String [] args) {
        LeerCadena(null);
        int vocales = contarVocales(args, null);
        System.out.println(vocales);
        Revez(null);
    }

}

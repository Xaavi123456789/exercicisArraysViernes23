import java.util.Scanner;

public class ARRAYS_EX2_VIERNES_23 {
       public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] dades = new int[6];

        for (int i = 0; i < dades.length; i++) {
            dades[i] = lector.nextInt();
        }
        for (int i = dades.length - 1; i >= 0; i--) {
            System.out.print(dades[i]);
        }

        for (int i = 0; i < dades.length; i++) {
            System.out.print(dades[i]);
        }
    }

}

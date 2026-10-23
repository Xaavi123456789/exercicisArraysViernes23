import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    int[] dades = new int[5];
    for (int i = 0; i < dades.length; i++) {
        dades[i] = input.nextInt();
    }

    for (int i = 0; i < dades.length; i++) {
        System.out.print(i + ": " + dades[i] + " ");
    }
    System.out.println();
    System.out.println("Longitud: " + dades.length + ". Primer valor: " + dades[0] + ". Últim valor: " + dades[dades.length - 1] + ".");
}

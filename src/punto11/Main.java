package punto11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        System.out.println("Ingrese la frase");
        frase = scanner.nextLine();
        System.out.println("Longitud de la frase: "+frase.length());
        numeroLetras(frase,'a');
        numeroLetras(frase,'e');
        numeroLetras(frase,'i');
        numeroLetras(frase,'o');
        numeroLetras(frase,'u');
    }

    private static void numeroLetras(String frase ,char a) {
        System.out.println("El numero de veces que aparece la letra "+a+" es :"+frase.chars().filter(letra -> letra ==a).count());
    }
}

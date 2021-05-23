package punto12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra1 = "", palabra2 = "";
        System.out.println("Ingrese la palabra 1");
        palabra1 = scanner.next();
        System.out.println("Ingrese la palabra 2");
        palabra2 = scanner.next();

        System.out.println((palabra1.equals(palabra2)) ? "Son iguales" : buscarDiferencias(palabra1, palabra2));

    }

    private static String buscarDiferencias(String palabra1, String palabra2) {
        String diferencias = "";

        diferencias = palabra1.replaceFirst(palabra2, " ");

        System.out.println(diferencias);
        return diferencias;
    }
}

package punto12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra1 = "", palabra2 = "";
        System.out.println("Ingrese la palabra 1");
        palabra1 = scanner.next();
        System.out.println("Ingrese la palabra 2");
        palabra2 = scanner.next();

        System.out.println((palabra1.equals(palabra2)) ? "Son iguales" : "las palabras diferentes entre la palabra 1 y la 2 son: "+ buscarDiferencias(palabra1, palabra2));

    }

    private static List<Character> buscarDiferencias(String palabra1, String palabra2) {
        List<Character> diferencias = new ArrayList<>();
        for (int i = 0; i < palabra1.length() + palabra2.length(); i++) {
            verificarletra(palabra1, palabra2, diferencias, i);
        }
        return diferencias;
    }

    private static void verificarletra(String palabra1, String palabra2, List<Character> diferencias, int i) {
        if (palabra1.length() > i && palabra2.length() > i) {
            if (palabra2.charAt(i) != palabra1.charAt(i)) {
                diferencias.add(palabra2.charAt(i));
            }
        }
    }

}

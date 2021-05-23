package punto9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        frase = frase.replace('a','e');
        System.out.println("Ingrese una frase para unir: ");
        frase = frase.concat(scanner.nextLine());
        System.out.println(frase);
    }
}

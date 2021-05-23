package punto10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        System.out.println("Ingresar una frase: ");
        frase = scanner.nextLine();
        frase = frase.replace(" ","");
        System.out.println(frase);
    }
}

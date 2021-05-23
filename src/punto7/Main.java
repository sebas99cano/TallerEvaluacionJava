package punto7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        int numero = 0;
        do {
            System.out.println("Ingrese un numero mayor o igual a cero: ");
            numero = scanner.nextInt();
            bandera = numero < 0;
        } while (bandera);
        System.out.println("El numero es: " + numero);
    }
}

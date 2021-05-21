package punto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el priemer numero: ");
        int variable1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int variable2 = scanner.nextInt();
        variableMayor(variable1, variable2);
    }

    public static void variableMayor(int variable1, int variable2) {
        if (variable1 > variable2) {
            System.out.println("La variable 1 es mayor con el numero : " + variable1);
        } else if (variable2 > variable1) {
            System.out.println("La variable 2 es mayor con el numero : " + variable2);
        } else {
            System.out.println("Las variables son iguales");
        }
    }
}
package punto3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en metros: ");
        String radio = scanner.next();
        calcularAreaCirculo(radio);

    }

    public static void calcularAreaCirculo(String radio) {
        double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
        System.out.println("El area del circulo es: " + area + " m2");
    }
}

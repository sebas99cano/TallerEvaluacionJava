package punto4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto: ");
        float valorProducto = Float.parseFloat(scanner.next());
        System.out.println("El valor del producto con IVA es de : "+valorProducto*1.21);
    }
}

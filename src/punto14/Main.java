package punto14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero para iniciar la secuencia");
        int numeroInicial = scanner.nextInt();
        for (int i = numeroInicial; i <= 1000; i = i+2){
            System.out.println("Numero: "+i);
        }
    }
}

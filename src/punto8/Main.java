package punto8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String diaSemana = "";
        System.out.println("Ingrese un dia de la semana: ");
        diaSemana = scanner.next();
        switch (diaSemana){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
                System.out.println("El dia ingresado no es valido");
                break;
        }
    }
}

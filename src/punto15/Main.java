package punto15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        do {
            imprimirMenu();
            opcion = scanner.nextInt();
            opcion = opcionesMenu(opcion);
        } while (opcion != 8);
    }

    private static int opcionesMenu(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Nuevo actor.. volviendo al menu");
                return 1;
            case 2:
                System.out.println("Buscar actor.. volviendo al menu");
                return 2;
            case 3:
                System.out.println("Eliminar actor.. volviendo al menu");
                return 3;
            case 4:
                System.out.println("Modificar actor.. volviendo al menu");
                return 4;
            case 5:
                System.out.println("Ver todos los actores.. volviendo al menu");
                return 5;
            case 6:
                System.out.println("Ver pelucilas de los actores.. volviendo al menu");
                return 6;
            case 7:
                System.out.println("Ver categoria de las peliculas de los actores.. volviendo al menu");
                return 7;
            case 8:
                System.out.println("Saliendo..");
                return 8;
            default:
                System.out.println("OPCION INCORRECTO");
                return -1;
        }
    }

    private static void imprimirMenu() {
        System.out.println("****** GESTION CINEMATOGRÁFICA ********");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }
}

package punto17;

import punto17.clases.Electrodomestico;
import punto17.clases.Lavadora;
import punto17.clases.Televisor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        float precioElectrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTelevisores = 0;

        for (int i = 0; i < 10; i++) {
            int tipoElectrodomestico = (int) ((Math.random() * (4 - 1)) + 1);
            if (tipoElectrodomestico == 1) {
                Electrodomestico electrodomestico = new Electrodomestico(350, "negro", 'C', 30);
                System.out.println(electrodomestico.toString());
                precioElectrodomesticos += electrodomestico.precioFinal();
                electrodomesticos.add(electrodomestico);
            } else if (tipoElectrodomestico == 2) {
                Lavadora lavadora = new Lavadora(400, "blanco", 'B', 100, 40);
                System.out.println(lavadora.toString());
                precioLavadoras += lavadora.precioFinal();
                electrodomesticos.add(lavadora);
            } else {
                Televisor televisor = new Televisor(600, "negro", 'A', 50, 50, true);
                System.out.println(televisor.toString());
                precioTelevisores += televisor.precioFinal();
                electrodomesticos.add(televisor);
            }
        }

        System.out.println("\nEl precio de los electrodomesticos es: " + precioElectrodomesticos + " euros");
        System.out.println("El precio de las lavadoras es: " + precioLavadoras + " euros");
        System.out.println("El precio de los televisores es: " + precioTelevisores + " euros");
        System.out.println("El precio total es : " + (precioElectrodomesticos + precioLavadoras + precioTelevisores) + " euros");

    }
}

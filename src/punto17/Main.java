package punto17;

import punto17.clases.Electrodomestico;
import punto17.clases.Lavadora;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(250,50);
        System.out.println(electrodomestico.toString());

        Lavadora lavadora = new Lavadora(350,"blanco",'a',35,40);
        System.out.println(lavadora.toString());
    }
}

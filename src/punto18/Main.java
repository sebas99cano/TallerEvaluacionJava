package punto18;

import punto18.clases.Entregable;
import punto18.clases.Serie;
import punto18.clases.Videojuego;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Serie> vectorSerie = new ArrayList<>();
        ArrayList<Videojuego> vectorVideojuego = new ArrayList<>();

        vectorSerie.add(new Serie("Suits", 9, "Drama", "Gabriel Macht"));
        vectorSerie.add(new Serie("Last Kingdom", "Alexander Dreymon"));
        vectorSerie.add(new Serie());
        vectorSerie.add(new Serie("Vikings", 4, "Violento", "Travis Fimmel"));
        vectorSerie.add(new Serie("Game of thrones", 8, "Drama", "George R.R Martin"));

        vectorVideojuego.add(new Videojuego("Minecraft", 3000, "SandBox", "Mojang"));
        vectorVideojuego.add(new Videojuego("League of Legends", 1600));
        vectorVideojuego.add(new Videojuego());
        vectorVideojuego.add(new Videojuego("The witcher 3", 64, "Aventure", "CD Projekt"));
        vectorVideojuego.add(new Videojuego("Grand Theft Auto v", 200));

        vectorSerie.get(4).entregar();
        vectorSerie.get(0).entregar();

        vectorVideojuego.get(0).entregar();
        vectorVideojuego.get(1).entregar();
        vectorVideojuego.get(4).entregar();

        System.out.println("El numero de seies estregadas es: " + contarEntregadosYDevolver(vectorSerie));
        System.out.println("El numero de Videojuegos estregados es: " + contarEntregadosYDevolver(vectorVideojuego));

        Entregable mayor = buscarMayor(vectorSerie);
        System.out.println("La serie con mas temporadas es: " + mayor.toString());

        mayor = buscarMayor(vectorVideojuego);
        System.out.println("El videojuego con mas horas estimadas es: " + mayor.toString());

    }

    private static Entregable buscarMayor(ArrayList vectorElementos) {
        Entregable mayor = (Entregable) vectorElementos.get(0);
        for (int i = 0; i < vectorElementos.toArray().length; i++) {
            if (mayor.compareTo(vectorElementos.get(i)) == (-1)) {
                mayor = (Entregable) vectorElementos.get(i);
            }
        }
        return mayor;
    }

    private static int contarEntregadosYDevolver(ArrayList vectorElementos) {
        var contadorEntregados = 0;
        for (var i = 0; i < vectorElementos.toArray().length; i++) {
            if (((Entregable) vectorElementos.get(i)).isEntregado()) {
                ((Entregable) vectorElementos.get(i)).devolver();
                contadorEntregados++;
            }
        }
        return contadorEntregados;
    }

}

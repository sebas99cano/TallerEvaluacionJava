package punto5;

public class Main {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 100) {
            System.out.println((contador % 2 == 0) ? "Es par: " + contador : "Es impar: " + contador);
            contador++;
        }
    }
}

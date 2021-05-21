package punto5;

public class Main {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 100) {
            String mensaje = "";
            mensaje = (contador % 2 == 0) ? "Es par: " + contador : "Es impar: " + contador;
            System.out.println(mensaje);
            contador++;
        }
    }
}

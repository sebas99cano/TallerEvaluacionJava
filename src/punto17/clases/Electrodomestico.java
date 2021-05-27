package punto17.clases;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {

    protected static final float PRECIO_BASE_DEFECTO = 100;
    protected static final String COLOR_DEFECTO = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    protected static final float PESO_DEFECTO = 5;

    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public Electrodomestico(float precioBase, float peso) {
        this(precioBase,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,peso);
    }

    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,PESO_DEFECTO);
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        List<Character> listaPosible = new ArrayList<>();
        listaPosible.add('A');
        listaPosible.add('B');
        listaPosible.add('C');
        listaPosible.add('D');
        listaPosible.add('E');

        this.consumoEnergetico = (listaPosible.stream().anyMatch(s -> s.equals(consumoEnergetico))) ? consumoEnergetico : CONSUMO_ENERGETICO_DEFECTO;

    }

    private void comprobarColor(String color) {
        List<String> listaPosible = new ArrayList<>();
        listaPosible.add("negro");
        listaPosible.add("rojo");
        listaPosible.add("azul");
        listaPosible.add("gris");

        this.color = (listaPosible.stream().anyMatch(s -> s.equalsIgnoreCase(color))) ? color : COLOR_DEFECTO;

    }

    public float precioFinal() {
        return precioBase+calcularPrecioConsumoEnergetico()+calcularPrecioPeso();
    }

    private float calcularPrecioConsumoEnergetico() {
        float precioAdicional = 0;
        switch (this.consumoEnergetico) {
            case 'A':
                precioAdicional = 100;
                break;
            case 'B':
                precioAdicional = 80;
                break;
            case 'C':
                precioAdicional = 60;
                break;
            case 'D':
                precioAdicional = 50;
                break;
            case 'E':
                precioAdicional = 30;
                break;
            case 'F':
                precioAdicional = 10;
                break;
            default:
                break;
        }
        return precioAdicional;
    }

    private float calcularPrecioPeso() {
        float precioAdicional = 0;
        if(this.peso <= 19){
            precioAdicional = 10;
        }else if(this.peso <= 49){
            precioAdicional = 50;
        }else if(this.peso <= 79){
            precioAdicional = 80;
        }else{
            precioAdicional = 100;
        }
        return precioAdicional;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" {" +
                "precioBase=" + precioBase +" euros"+
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", Precio Final=" + precioFinal() +" euros"+
                '}';
    }
}

package punto17.clases;

public class Lavadora extends Electrodomestico{
    private static final float CARGA_DEFECTO = 5;

    private float carga;

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,peso);
    }

    public Lavadora() {
        this(PRECIO_BASE_DEFECTO,COLOR_DEFECTO,CONSUMO_ENERGETICO_DEFECTO,PESO_DEFECTO,CARGA_DEFECTO);
    }

    @Override
    public float precioFinal() {
        return super.precioFinal()+calcularPrecioCarga();
    }

    private float calcularPrecioCarga() {
        return (this.carga > 30)?50:0;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "carga=" + carga +
                '}';
    }

    public float getCarga() {
        return carga;
    }
}

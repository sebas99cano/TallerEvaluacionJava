package punto17.clases;

public class Lavadora extends Electrodomestico{
    private static final float cargaDefecto = 5;

    private float carga = cargaDefecto;

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
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
}

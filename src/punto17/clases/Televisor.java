package punto17.clases;

public class Televisor extends Electrodomestico {
    private static final int resolucionDefecto = 20;
    private static final boolean sintonizadorTDTDefecto = false;

    private int resolucion = resolucionDefecto;
    private boolean sintonizadorTDT = sintonizadorTDTDefecto;

    public Televisor(float precioBase, String color, char consumoEnergetico, float peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(float precioBase, float peso) {
        super(precioBase, peso);
    }

    public Televisor() {
    }

    @Override
    public float precioFinal() {
        return super.precioFinal()+calcularPrecioResolucion()+calcularPrecioSintonizadorTDT();
    }

    private float calcularPrecioSintonizadorTDT() {
        return (this.sintonizadorTDT)?50:0;
    }

    private float calcularPrecioResolucion() {
        return (this.resolucion > 40)? (float) (super.precioFinal() * 0.3) :0;
    }

    @Override
    public String toString() {
        return super.toString()+" {" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}

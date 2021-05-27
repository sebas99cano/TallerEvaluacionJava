package punto18.clases;

public class Videojuego implements Entregable{
    private static final String TITULO_DEFECTO = "";
    private static final int HORAS_ESTIMADAS_DEFECTO = 10;
    private static final boolean ENTREGADO_DEFECTO = false;
    private static final String GENERO_DEFECTO="";
    private static final String COMPANIA_DEFECTO="";

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this(TITULO_DEFECTO,HORAS_ESTIMADAS_DEFECTO,GENERO_DEFECTO,COMPANIA_DEFECTO);
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this(titulo,horasEstimadas,GENERO_DEFECTO,COMPANIA_DEFECTO);
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = ENTREGADO_DEFECTO;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        int comparacion = -1; // es mayor el objeto a
        if(this.horasEstimadas ==  ((Videojuego) a).getHorasEstimadas()){
            comparacion = 0; //ambos son iguales
        }else if(this.horasEstimadas >  ((Videojuego) a).getHorasEstimadas()){
            comparacion = 1; //es menor el objeto a
        }
        return comparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}

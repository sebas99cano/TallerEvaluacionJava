package punto18.clases;

public class Serie implements Entregable{
    private static final String TITULO_DEFECTO = "";
    private static final int NUMERO_TEMPORADAS_DEFECTO = 3;
    private static final boolean ENTREGADO_DEFECTO = false;
    private static final String GENERO_DEFECTO="";
    private static final String CREADOR_DEFECTO="";

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this(TITULO_DEFECTO,NUMERO_TEMPORADAS_DEFECTO,GENERO_DEFECTO,CREADOR_DEFECTO);
    }

    public Serie(String titulo, String creador) {
        this(titulo,NUMERO_TEMPORADAS_DEFECTO,GENERO_DEFECTO,creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = ENTREGADO_DEFECTO;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public boolean isEntregado() {
        return false;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

}

package punto16.clases;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = 'M';
    private float peso = 0;
    private float altura = 0.1f;

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    private int calcularIMC() {
        float funcion = (float) (this.peso / Math.pow(this.altura, 2));
        int interpretacion;
        if (funcion < 20) {
            interpretacion = -1;//por debajo de su peso ideal
        } else if (funcion > 25) {
            interpretacion = -1;//peso ideal
        } else {
            interpretacion = 0;//sobrepeso
        }
        return interpretacion;
    }

    private boolean esMayorDeEdad() {
        return this.edad > 17;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'M' || sexo != 'F') {
            this.sexo = 'M';
        }
    }

    private void generaDNI() {
        this.dni = String.valueOf((Math.round(Math.random() * 100000000)));
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

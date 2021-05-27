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
        comprobarSexo(sexo);
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generaDNI();
    }

    public String calcularIMC() {
        float funcion = (float) ((this.peso / Math.pow(this.altura,2)));
        String interpretacionIMC;
        if (funcion < 20) {
            interpretacionIMC = -1 +"(por debajo de su peso ideal)";
        }else if(funcion > 19 && funcion < 26){
            interpretacionIMC = 0 + "(esta en su peso ideal)";
        }else{
            interpretacionIMC = 1+ "(por encima de su peso ideal)";
        }
        return interpretacionIMC;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 17;
    }

    private void comprobarSexo(char sexo) {
        if(sexo == 'M'){this.sexo = sexo;}
    }

    private void generaDNI() {
        int numeroDNI = (int) Math.round((Math.random()*(99999999-10000000)+10000000));
        this.dni = ((numeroDNI)+"-"+ calcularletraDNI(numeroDNI));
    }

    private static char calcularletraDNI(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", es mayor de edad =" + esMayorDeEdad() +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", IMC=" + calcularIMC() +
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

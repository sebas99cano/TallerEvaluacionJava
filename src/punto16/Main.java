package punto16;

import punto16.clases.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el sexo M(masculino)/F(femenino): ");
        char sexo = scanner.next().charAt(0);
        System.out.println("Ingrese el peso en kg: ");
        float peso = scanner.nextFloat();
        System.out.println("Ingrese la altura en metros: ");
        float altura = Float.parseFloat(scanner.next());

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);

        Persona persona2 = new Persona(nombre,edad,sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("Sebastian Cano");
        persona3.setEdad(15);
        persona3.setSexo('M');
        persona3.setPeso(75);
        persona3.setAltura(1.75F);

        System.out.println("la persona 1 esta: "+persona1.calcularIMC());
        System.out.println("la persona 2 esta: "+persona2.calcularIMC());
        System.out.println("la persona 3 esta: "+persona3.calcularIMC());

        System.out.println("la persona 1 es mayor de edad: "+persona1.esMayorDeEdad());
        System.out.println("la persona 2 es mayor de edad: "+persona2.esMayorDeEdad());
        System.out.println("la persona 3 es mayor de edad: "+persona3.esMayorDeEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}

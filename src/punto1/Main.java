package punto1;

public class Main {
    public static void main(String[] args) {
        variableMayor(67, 90);
    }

    public static void variableMayor(int variable1, int variable2) {
        if (variable1 > variable2) {
            System.out.println("La variable mayor es : " + variable1);
        } else if (variable2 > variable1) {
            System.out.println("La variable mayor es : " + variable2);
        } else {
            System.out.println("Las variables son iguales");
        }
    }
}

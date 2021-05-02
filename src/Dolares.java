import java.util.Scanner;

public class Dolares {
    public static void main(String[] args){
        double cantidad = 0;
        double tipoCambio = 0;
        double resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad: ");
        cantidad  = entrada.nextDouble();

        System.out.println("Introduce el tipo de cambio: ");
        tipoCambio  = entrada.nextDouble();

        resultado = cantidad * tipoCambio;

        System.out.println("Tus dolares en pesos es: " + resultado);

    }
}

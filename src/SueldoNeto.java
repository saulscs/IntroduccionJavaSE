// Los empleados tienen todos el mismo sueldo base (BA), cada empleado pertenece a una
//categoria (CA) 1,2,5,10,20,30 tambien dentro de cada categoria el empleado trabja en una
//zona de riesgo (ZR) A,B,C. El sueldo bruto de cada empleado se calcula sumando el BA más
// un 5%, 10% , 15%, 25%, 40% del BA por cada categoria correspondiente la cuenta anterior
//se multiplica por un factor de 1,2 o 3 según la zona de riesgo de trabajo, además los empleados reciben
// un aumento del 3% del BA por cada hijo (NH). Todos tienen un descuento del 1.5% del BR en concepto de
//aportes, a esto le tenemos que quitar el 30% de impuesto para obtener el sueldo neto.

import java.util.Scanner;

public class SueldoNeto {
    public static void main(String[] args){

        double sueldoBase = 0;
        double sueldoBruto = 0;
        double sueldoNeto = 0;
        double impuesto = 0.30;
        double calculoImpuesto;
        double aumento = 0;
        double aporte = 0;
        int    hijos;
        int    categoria;
        String zonaRiesgo;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu sueldo básico: ");
        sueldoBase  = entrada.nextDouble();

        System.out.println("Introduce tu categoria (1,5,10,20,30): ");
        categoria  = entrada.nextInt();

        System.out.println("Introduce tu zona de riesgo ( a,b,c): ");
        zonaRiesgo  = entrada.next();

        System.out.println("Ingresa la cantidad de hijos (si no tienes pon 0): ");
        hijos = entrada.nextInt();

        switch (categoria){
            case 1: sueldoBruto = sueldoBase + (sueldoBase * 0.05);
                    break;
            case 5: sueldoBruto = sueldoBase + (sueldoBase * 0.10);
                    break;
            case 10: sueldoBruto = sueldoBase + (sueldoBase * 0.15);
                    break;
            case 20: sueldoBruto = sueldoBase + (sueldoBase * 0.25);
                    break;
            case 30: sueldoBruto = sueldoBase + (sueldoBase * 0.40);
                    break;
            default: sueldoBruto = sueldoBase * 1;
        }

        switch (zonaRiesgo){
            case "a": sueldoBruto = sueldoBruto * 1;
                    break;
            case "b": sueldoBruto = sueldoBruto * 2;
                break;
            case "c": sueldoBruto = sueldoBruto * 3;
                break;
            default: System.out.println("La zona de riesgo no es valida");
        }

        if(hijos > 0 ){
            aumento = (sueldoBase * 0.03) * hijos;
        } else {
            aumento = 0;
        }

        aporte = sueldoBruto * 0.015;

        sueldoBruto = sueldoBruto + aumento - aporte;

        calculoImpuesto = sueldoBruto * impuesto;

        sueldoNeto = sueldoBruto - calculoImpuesto;

        System.out.println("Tu sueldo neto es " + sueldoNeto);

    }
}

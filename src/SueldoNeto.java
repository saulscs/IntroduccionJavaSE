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

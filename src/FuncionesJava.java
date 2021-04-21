public class FuncionesJava {
    public static void main(String[] args){
        double y = 3;
        //Area de un circulo
        //pi * r2
        double area =  circleArea(y);
        System.out.println(area);

        //Area de una esfera
        //4*PI*r2


        double spheraA = spheraArea(y);
        System.out.println(spheraA);

        //Volumen de una esfera
        //(4/3) * pi * r3
        double spheraV = spheraVolumen(y);
        System.out.println( spheraV);

        System.out.println("PESOS A DOLARES: " + convertirDolar( 200,  "MXN"  ));
    }
    public static double circleArea( double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double spheraArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double spheraVolumen(double r){
        return (4/3)  * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Funcion que convierte de pesos a dolares.
     * @param quanty Cantidad de dinero
     * @param currency  Tipo de moneda: solo acepta MXN o COP
     * @return quanty devuelve la contidad en dolares.
     * */

    public static double convertirDolar(double quanty, String currency){
        //MXN to COP

        switch (currency){
            case "MXN":
                quanty = quanty * 0.052;
                break;
            case "COP":
                quanty = quanty * 0.00031;
                break;
        }
        return quanty;
    }
}


//Solo los metodos que comparten main llevan static
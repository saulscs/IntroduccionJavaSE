public class MathematicOperations {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia ariba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado al cuadrado
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.pow(y,2));

        //Devuelve area de un circulo
        System.out.println(Math.PI * Math.pow(y,2));

        //Devuelve area de una esfera
        System.out.println(4* Math.PI * Math.pow(y,2));

        //Volumen esfera
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}

public class Casting {
    public static void main(String[] args){
        //En un año ubicar 30 perritos en hogares
        //Cuantos perritos ubique al mes

        double montlyDogs = 30.0 / 12.0;
        System.out.println(montlyDogs);

        //ESTIMACION
        int estimatedMontlyDogs = (int) montlyDogs; // Se trunca la parte decimal
        System.out.println(estimatedMontlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        //Aquí no se pasa a double
        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);


    }
}

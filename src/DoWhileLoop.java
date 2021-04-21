import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        int response = 0;
        do{
            System.out.println("Selecciona el numero de la opción deseada: \n");
            System.out.println("1. Movies\n");
            System.out.println("2. Series\n");
            System.out.println("0. Salir\n");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("\nGracias por vistarnos\n");
                    break;
                case 1:
                    System.out.println("\nMovies\n");
                    break;
                case 2:
                    System.out.println("\nSeries\n");
                    break;
                default:
                    System.out.println("Selecciona la opcion correcta");
            }
        } while (response != 0);
        System.out.println("Se termino el programa");
    }
}

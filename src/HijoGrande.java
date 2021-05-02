import java.util.Scanner;

public class HijoGrande {
    public static void main(String[] args){
        int size = 0;
        int[] array;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el numero que va a la excursión: ");
        size = scanner.nextInt();
        array = new int[size];

        int [] edades = entrada(array);

       int hijoMayor =  mayor(edades);

        System.out.println("El hijo mayor tiene: " + hijoMayor );

    }

    public static int[] entrada(int[] arr){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa la edad de los que van: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa el numero: " + (i + 1) );
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int mayor(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}

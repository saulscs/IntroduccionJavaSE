import java.util.Scanner;

public class MasDinero {
    public static void main(String[] args){
        int[] array1  = new int[3];
        int[] array2 = new int[2];

        int[] juan = entrada(array1);
        int[] pedro = entrada(array2);

        int sumaJuan = sumaArray(juan);
        int sumaPedro = sumaArray(pedro);

        comparar(sumaJuan,sumaPedro);
    }

    public static int[] entrada(int[] arr){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa los numeros que corresponden");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa el numero: " + (i + 1) );
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    /*public static int[] imprimeArray(int[] arr){
        System.out.println("Entered Arrays values : \r");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        return arr;
    }*/

    public static int sumaArray(int[] arr){
        int sum = 0;
        for( int num : arr) {
            sum = sum+num;
        }
        return sum;
    }

    public static void comparar(int a, int b){
        if(a > b){
            System.out.println("Juan tiene más dienro");
        } else{
            System.out.println("Pedro tiene más dinero");
        }
        return;
    }
}

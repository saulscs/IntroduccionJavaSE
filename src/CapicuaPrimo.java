import java.util.Scanner;

public class CapicuaPrimo {
    public static void main(String[] args){
        int exit = 5;
        double number = 0;
        do{
            System.out.println("Selecciona el numero de la opción deseada: \n");
            System.out.println("1. Registrar numero \n");
            System.out.println("2. Es capicúa\n");
            System.out.println("3. Es primo:\n");
            System.out.println("4. Elevado al cuadrado su producto es:\n");
            System.out.println("5. Salir:\n");
            Scanner sc = new Scanner(System.in);
            Scanner entry = new Scanner(System.in);
            exit = Integer.valueOf(sc.nextLine());


            switch (exit){
                case 1:
                    System.out.println("\nIngresa el número:\n");
                    number = entry.nextDouble();
                    System.out.println("El numero ingresado es :" + number + "\n");
                    break;
                case 2:
                    capicua(number);
                    break;
                case 3:
                   primo(number);
                    break;
                case 4:
                    cuadrado(number);
                    break;
                default:
                    System.out.println("\nSelecciona la opcion correcta\n");
            }
        } while (exit != 5);
        System.out.println("Se termino el programa");
    }

    public static void  capicua(double number){
        double num = number;
        double inv = 0;
        double digit;
        double aux = number;

        while(aux > 0){
            digit = aux%10;
            inv = inv*10+digit;
            aux = aux/10;
        }

        if(num == inv){
            System.out.println("\nEs capicua\n");
        } else{
            System.out.println("\nNo es capicua\n");
        }

        return;
    }

    public static void primo(double number){
        double aux;
        int j = 0;

        for (int i = 2; i < number ; i++) {
            aux = number % i;
            if(aux == 0){
                j = 1;
            }
        }
        if(j == 0){
            System.out.println("\nEl numero es primo\n");
        }else{
            System.out.println("\nEl numero NO es primo\n");
        }
        return;
    }

    public static void cuadrado(double number){
        System.out.println("\nElevado al cuadrado: " + Math.pow(number,2) + "\n");
        return;
    }
}

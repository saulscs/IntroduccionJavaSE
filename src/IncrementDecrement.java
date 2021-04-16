public class IncrementDecrement {
    public static void main(String[] args){
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);//4

        lives--; //Decremento
        System.out.println(lives); //3

        lives ++; //Incremento
        System.out.println(lives); //4

        //Regalo
        //Gana un regalo por cada vida
        int gift = 100 + lives++; // postfijo se accede al dato anterior de la variable y despues la incrementa
        System.out.println(gift);

        int gift2 = 100 + ++lives; // prefijo 
        System.out.println(gift2);





    }
}

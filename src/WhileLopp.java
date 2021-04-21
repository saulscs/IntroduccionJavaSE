public class WhileLopp {
    static boolean isTurnOnLight = false;

    public static void main(String[] args){
        isTurnOf();

        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean isTurnOf(){
        isTurnOnLight = (isTurnOnLight) ? false:true;
        return isTurnOnLight;
    }
}

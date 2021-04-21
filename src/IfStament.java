public class IfStament {
    public static void main(String[] args){
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Enciende el bluetooth para iniciar la transferencia");
        }
    }
}

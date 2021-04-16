public class VariablesActualizadas {
    public static void main(String[] args){
        int salary = 1000;
        //Bono $200
        salary = salary + 200;
        System.out.println(salary);

        //Pension: $50 pesos descuento

        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras $30 c/u
        //Comida $45

        salary = salary + (2*30) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employName = "Saúl Corona ";
        employName = employName + "Santos";
        System.out.println(employName);


    }
}

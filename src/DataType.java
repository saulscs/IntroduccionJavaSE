public class DataType {
    public static void main(String[] args){
        int numberInt = 123213123;
        long numberLong = 323131231L; // lleva L al final
        double numberDouble = 123.1321; //comodin porqeue requiere mucha presición
        float numberFloat = 123.233F; // cuando no se necesita tanta presición F al final

        int salary = 100;
        System.out.println(salary);

        //pension
        double pension = salary * 0.3;
        double totalSalary = salary - pension;

        System.out.println(totalSalary);

        String employName = "saul";
        System.out.println("EMPLOY: " + employName + " SALARY");



    }
}

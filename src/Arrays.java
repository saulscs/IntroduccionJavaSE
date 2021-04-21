public class Arrays {
    public static void main(String[] args) {
        String[] androidVersiones = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2]; // 4 * 2

        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new int [2][2][2][2];

        androidVersiones[0] = "Apple Pie";
        androidVersiones[1] = "Bannana bread";
        androidVersiones[2] = "Cupcake";
        androidVersiones[3] = "Donut";

        System.out.println(androidVersiones[0]);
        System.out.println(androidVersiones[1]);
        System.out.println(androidVersiones[2]);
        System.out.println(androidVersiones[3]);

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Guadalajara";
        cities[2][1] = "Mexico";
        cities[3][0] = "Colombia";
        cities[3][1] = "Colombia";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        String [][][][] animals = new String[2][3][2][2];

        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);


    }
}

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

        /** for (int i = 0; i < androidVersiones.length; i++) {
            System.out.println(androidVersiones[i]);
        }*/


        for (String androidVersion : androidVersiones) {
            System.out.println(androidVersion);
        }

        //System.out.println(androidVersiones[0]);
        //System.out.println(androidVersiones[1]);
        //System.out.println(androidVersiones[2]);
        //System.out.println(androidVersiones[3]);

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

       /**  for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        } */

        for (String[] pair : cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }

        String [][][][] animals = new String[2][3][2][2];

        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i <= 1 ; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }


    }
}

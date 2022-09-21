public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "istanbul";
        cities[0][1] = "hatay";
        cities[0][2] = "şanlıurfa";
        cities[1][0] = "gaziantep";
        cities[1][1] = "denizli";
        cities[1][2] = "ankara";
        cities[2][0] = "izmir";
        cities[2][1] = "adana";
        cities[2][2] = "tokat";
        for(int i = 0;i<=2;i++){
            System.out.println("**********");
            for(int j=0;j<=2;j++){
                System.out.println(cities[i][j]);
            }
        }

    }
}
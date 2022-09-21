public class Main {
    public static void main(String[] args) {
            //6 -> 1,2,3  1+2+3 = 6
        int num = 5;
        int sum = 0;

        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum = sum+i;
            }

        }
        if(sum == num){
            System.out.println("it is a perfect num.");
        }
        else {
            System.out.println("it is not perfect num.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 25;
        int num3 = 2;
        int biggestNum = num1;

        if(biggestNum < num2)
        {
            biggestNum = num2;
        }
        if(biggestNum<num3)
        {
            biggestNum = num3;
        }
        System.out.println("biggest num is : " + biggestNum);
    }
}
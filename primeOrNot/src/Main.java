public class Main {
    public static void main(String[] args) {
        int num = 25;
        int remain = num%2;
        System.out.println(num);
        boolean isPrime = true;

        if(num<2)
        {
            System.out.println("invalid number");
        }

        for(int i = 2;i<num;i++)
        {
            if(num%i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("the number is not prime.");
        }
    }
}
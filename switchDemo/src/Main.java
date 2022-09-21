public class Main {
    public static void main(String[] args) {
        char grade =  'A';

        switch (grade)
        {
            case 'A' :
                System.out.println("you passed perfectly");
                break;
            case 'B' :
                System.out.println("you passed very good.");
                break;
            case 'C' :
                System.out.println("you passed good.");
                break;
            case 'D' :
                System.out.println("you passed not bad");
                break;
            case 'F' :
                System.out.println("unfortunately you failed.");
                break;
            default:
                System.out.println("invalid grade");

        }
    }
}
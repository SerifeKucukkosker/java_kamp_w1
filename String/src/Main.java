public class Main {
    public static void main(String[] args) {
        String student1 = "Serife";
        String student2 = "Temmuz";
        String student3 = "Mehmet";
        String student4 = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("********************");

        String[] students = new String[4];
        students[0] = "Serife";
        students[1] = "Temmuz";
        students[2] = "Mehmet";
        students[3] = "Ahmet";

        for(int i = 0 ; i <students.length ; i++)
        {
            System.out.println(students[i]);
        }
        System.out.println("***********");
        for(String student : students)
        {
            System.out.println(student);
        }
    }
}
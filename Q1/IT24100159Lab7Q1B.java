import java.util.Scanner;
public class IT24100159Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while (count <= 3) {
            System.out.println("Student "+ count);
            count++;
            System.out.print("Enter marks : ");

            int mark1 = scanner.nextInt();
            System.out.print("Enter marks : ");
            int mark2 = scanner.nextInt();
            System.out.print("Enter marks : ");
            int mark3 = scanner.nextInt();
            System.out.print("Enter marks : ");
            int mark4 = scanner.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4)/4.0;
            System.out.println("Average is : "+ average);

            if(average >= 75 && average <= 100)
                {
                  System.out.println("Overall Grade is : Distinction");
                 }
            else if(average >= 50 && average <=74)
               {
                  System.out.println("Overall Grade is : Credit");
                }
            else{
                  System.out.println("Overall Grade is : Fail");
                 }
        }
    
    }
}
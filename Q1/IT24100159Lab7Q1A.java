import java.util.Scanner;
public class IT24100159Lab7Q1A{
    public static void main(String[] args){
         Scanner scanner = new Scanner (System.in);

         System.out.println("Enter marks for four subjects :");
         int total = 0;
         int number = 1;
         while(number <= 4) {
             System.out.print("Enter Subject Mark "+number+":");
             int marks = scanner.nextInt();
             number += 1;
             total += marks;
        }
         double average = (double) total/4;

         System.out.println("Average :" + average);

         if(average >=75){
         System.out.print("Overall Grade is : Distinction");}
         else if(average >=50 && average < 75 ){
             System.out.print("Overall Grade is : Credit");
         }else{System.out.print("Overall Grade is : Fail");}
    }
        }
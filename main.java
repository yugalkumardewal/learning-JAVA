
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("Grade A \n Status: Exellent Work");
        }
        else if(marks >= 80 && marks <= 89){
            System.out.println("Grade B \n Status: Good Work");
        }
        else if(marks >= 70 && marks <= 79){
            System.out.println("Grade C \n Status: Fair Effort");
        }
        else if(marks >= 60 && marks <= 69){
            System.out.println("Grade D \n Status: Needs Improvement");
        }
        else{
            System.out.println("Grade F \n Status: Fail Try Again");
        }
    }   
}
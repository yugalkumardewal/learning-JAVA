// loop for square pattern/ rectangle pattern
import java.util.Scanner; //this helps to take input from the user
public class main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows "); // asking for the input of rows from the user
        int rows = sc.nextInt();
        System.out.println("enter number of columns: "); //asking user for the nukber of columns u need in square/rectangle pattern
        int columns = sc.nextInt();
        //using for loop & nested loops for making Square/Rectangle pattern
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
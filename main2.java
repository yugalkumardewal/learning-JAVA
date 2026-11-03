// importing scanner
import java.util.Scanner; // Semicolon ';' statement terminator hota hai

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows in triangle:");
        int rows = sc.nextInt();
        
        // ther is no use to take input for the columns in triangle

        for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); // use print in triangle pattern not println 
            }
            System.out.println(); // prints in new line after the code runs
        }
        
        sc.close();
    }
}
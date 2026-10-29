import java.util.Scanner; // <-- 1. Added this import at the top

public class main { // <-- 2. Capitalized 'Main' to match the file name
    public static void main(String[] args) {
        int num[] = new int[2];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        
        num[0] = age;
        num[1] = num[0] * 2;
        
        System.out.println("Your age is: " + num[0]);
        System.out.println("Double your age is: " + num[1]);
        
        scanner.close(); // Good practice to close the scanner
    }
}
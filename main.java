import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        
       
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        int highest = num[0]; 
        for(int i = 1; i < 5; i++) {
            if(num[i] > highest) {
                highest = num[i]; 
            }
        }

        double sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += num[i]; 
        }
        double average = sum / 5; 

        System.out.println("-------------------");
        System.out.println("Highest Value : " + highest);
        System.out.println("Average average : " + average);

        sc.close();
    }
}
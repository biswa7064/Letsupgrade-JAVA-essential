import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number[] = new int[5];
        int sum = 0;
        System.out.println("Enter 5 number : ");
        for(int i = 0; i<number.length; i++){
            number[i]= scan.nextInt();  
        }

        System.out.println("\n");
        for(int i = 0; i<number.length; i++){
            sum += number[i] ;
        }
        System.out.println("Sum of the numbers is : "+sum);
        
    }
}
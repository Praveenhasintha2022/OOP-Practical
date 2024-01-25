
import java.util.Scanner;

public class ArrayOperationsMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayOperations obj = new ArrayOperations();

    public static void main(String[] args) {

        System.out.println("How many numbers do you going to enter ?");
        int size = sc.nextInt();

        int array[] = new int[size];
        
        ArrayOperations.fill(array);
        ArrayOperations.see(array);
        ArrayOperations.reverse(array);
        ArrayOperations.sort(array);
        ArrayOperations.see(array);

        System.out.print("Enter the number do you want to search : ");
        int a = sc.nextInt();
        ArrayOperations.search(array, a);
        
        System.out.println("Sum : " + ArrayOperations.addition(array));
    }
}
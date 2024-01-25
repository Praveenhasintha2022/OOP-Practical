
import java.util.Scanner;


public class ArrayOperations {

    static Scanner sc = new Scanner(System.in);

    public static void fill(int array[]) {
        
        System.out.println("Enter the numbers....");

        for(int i=0; i<array.length; i++)
            array[i] = sc.nextInt();
        
        System.out.println("\n");
    }


    public static void see(int array[]){
        System.out.print("Numbers You entered :");

        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + ", ");
        
        System.out.println("\n");
    }


    public static void reverse(int array[]){
        System.out.print("Reverse Array : ");

        for(int i=array.length-1; i>=0; i--)
            System.out.print(array[i] + ", ");
            
        System.out.println("\n");
    }

    public static void sort(int array[]){
        int temp;
        for(int i=0; i<array.length; i++){          
            for(int j=0; j<array.length; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void search(int array[], int x){
        boolean j = false;

        for(int i=0; i<array.length; i++){
            if(x == array[i]){
                System.out.println(" is found in " + (i+1) + "th position.");
                j = true;
            }
        }

        if(j==false){
            System.out.println("Number not found.");
        }

        System.out.println("\n");
    }

    public static int addition(int array[]){
        int sum = 0;

        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }

    public static int maximum(int array[]){
        int max = array[0];

        for(int i=0; i<array.length; i++){
            if(max<array[i])
                max = array[i];
        }

        return max;
    }

    public static int minimum(int array[]){
        int min = array[0];

        for(int i=0; i<array.length; i++){
            if(min>array[i])
                min = array[i];
        }

        return min;
    }
    
}

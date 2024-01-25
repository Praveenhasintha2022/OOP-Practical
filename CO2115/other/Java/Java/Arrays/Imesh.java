
package Arrays;

import java.util.Scanner;

public class Imesh {
    
    static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int num[] = new int[5];
        
        for(int i=0; i<5; i++){
            System.out.print("Array["+i+"]= ");
            num[i] = a.nextInt();
        }
        
        System.out.println(" ");
        
        System.out.print("Array[5] = {");
        for(int j=0; j<num.length; j++){
            System.out.print(num[j] + ", ");
        }
        System.out.println("}");
        
        System.out.println(" ");
        
        int sum = 0;
        for(int k=0; k<num.length; k++){
            sum += num[k];
        }
        System.out.println("Sum = " + sum);
        
        
        //Enhanced for loop
        int total = 0;
        for(int x: num){
            total +=x;
        }
        System.out.println("Total = " + total); 
    }
}


import java.util.Scanner;

public class binary_Search{

    static int array[] = {2,3,5,7,10,11,12,17,19,23,29,31,37,41,43};
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Numbers : ");

        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        
        System.out.println();
        
        System.out.print("Enter number you want to search :");
        int srch = sc.nextInt();

        System.out.println();

        int result = b_Search(srch);

        if(result<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found in "+result);
        }
    }

    public static int b_Search(int x){
        
        int low = 0;
        int high = array.length;

        while(true){
            
            int mid = (low+high)/2;

            if(x==array[mid]){
                return mid;
            }
            else if(x>array[mid]){
                low = mid+1;
            }
            else if(x<array[mid]){
                high = mid-1;
            }
            else{
                return -1;
            }
            
        }
    }
}
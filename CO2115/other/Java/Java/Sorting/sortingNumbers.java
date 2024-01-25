

import java.util.Scanner;

public class sortingNumbers {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sortingNumbers obj = new sortingNumbers();
        
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        
        System.out.println("Enter the numbers : ");
        int a[] = new int[size];
        
        obj.inputArray(a);
        System.out.println("");
        obj.sort(a);
        obj.printArray(a);
        System.out.println("");
    }
    
    public void inputArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print("Array["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    
    private void sort(int a[]){
        int temp;
        for(int i=0; i<a.length; i++){          
            for(int j=0; j<a.length; j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    public void printArray(int a[]){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
}

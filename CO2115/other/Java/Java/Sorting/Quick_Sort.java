

public class Quick_Sort {
    
    public static void main(String[] args) {
        
        Quick_Sort obj = new Quick_Sort();
        
        int array[] = {5, 2, 3, 6, 12, 7, 14, 9, 10, 11};
        int n = array.length;
        
        obj.printArray(array, n);
    }
    
    private void printArray(int arr[], int n){
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
    
}

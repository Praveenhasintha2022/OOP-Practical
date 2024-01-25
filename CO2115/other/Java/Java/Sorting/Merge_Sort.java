

public class Merge_Sort {
    
    public static void main(String[] args) {
        
        Merge_Sort obj = new Merge_Sort();
        
        int array[] = {4, 0, 6, 1, 5, 2, 3};
        int low = obj.lowValue(array);
        int heigh = obj.heighValue(array);
        int mid = low + (heigh-low)/2;
        
        obj.sort(array, low, heigh);
        obj.merge(array, low, mid, heigh);
        obj.printArray(array);
    }
    
    private void sort(int arr[], int l, int h){
        if(l<h){
            int m = l + (h-l)/2;
            
            sort(arr, l, m);
            sort(arr, m+1, h);
            
            merge(arr, l, m, h);
        }
    }
    
    private void merge(int arr[], int l, int m, int h){
        int n1 = m;
        int n2 = h - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i=0; i<n1; i++)
            L[i] = arr[l+i];
        
        for(int i=0; i<n2; i++)
            R[i] = arr[m+1+i];
        
        int i=0, j=0, k=1;
        
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    private int lowValue(int arr[]){
        int x = arr[0];
        for(int i=0; i<arr.length; i++){
            if(x>arr[i])
                x = arr[i];
        }
        return x;
    }
    
    private int heighValue(int arr[]){
        int x = arr[0];
        for(int i=0; i<arr.length; i++){
            if(x<arr[i])
                x = arr[i];
        }
        return x;
    }
    
    private void printArray(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
}

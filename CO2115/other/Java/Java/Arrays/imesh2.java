
package Arrays;

public class imesh2 {
    
    public static void main(String[] args) {
        
        int Array[] = {2,3,4,5,6};
        nextMeth(Array);
        
        for(int y: Array)
            System.out.println(y);
        
    }
    
    public static void nextMeth(int x[]){
        for(int i=0; i<x.length; i++)
            x[i] += 10;
        
    }
}

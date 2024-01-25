
import java.util.Scanner;

public class matrixMethods {
    
    Scanner sc = new Scanner(System.in);
    int m,n;
    double array[][] = new double[m][n];

    public void preparingMatrix(){

        System.out.print("m : ");
        m = sc.nextInt();
        
        System.out.print("/nn : ");
        n = sc.nextInt();

    }

    public void print(){
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                System.out.print(array[i][j] + "/t");
            }
        }
    }

    public void enter(){
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                array[i][j] = sc.nextDouble();
            }
        }
    }

}



import java.util.Scanner;

public class matrixMain {

    static Scanner sc = new Scanner(System.in);
    static matrixMethods obj = new matrixMethods();

    public static void main(String[] args) {

        System.out.println("Enter the size of matrix");

        obj.preparingMatrix();
        obj.enter();
        obj.print();
        
    }
}

import java.util.Scanner;

public class Binary_to_decimal {

    Scanner sc = new Scanner(System.in);

    int binaryNu;
    int decimalNu;

    public static void main(String[] args) {

        Binary_to_decimal obj = new Binary_to_decimal();

        System.out.print("Enter the binary number : ");
        obj.input();

        System.out.print("The decimal number : "+ obj.b2d());
    }
    
    private int input(){
        return binaryNu = sc.nextInt();
    }

    private int b2d(){
        int remainder;
        int i=1;

        while(true){
            remainder = binaryNu % 10;
            decimalNu += remainder*i;
            binaryNu = binaryNu/10;
            i = i*2;

            if(binaryNu==0)
                break;
        }

        return decimalNu;
    }

}


import java.util.Scanner;

public class converter {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int decimalNu;
        int binary[] = new int[100];
        int i = 0;

        System.out.print("Enter the Decimal number : ");
        decimalNu = sc.nextInt();

        while(true){
            if(decimalNu==0)
                break;
            else{
                binary[i] = decimalNu%2;
                decimalNu = decimalNu/2;
                i++;
            }
        }

        System.out.print("Binary : ");

        for(int j=i-1; j>=0; j--)
            System.out.print(binary[j]);

        
    }
}

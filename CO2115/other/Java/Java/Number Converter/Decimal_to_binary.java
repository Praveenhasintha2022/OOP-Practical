
import java.util.Scanner;

public class Decimal_to_binary {

    Scanner sc = new Scanner(System.in);

    int decimalNu;
    int binary[] = new int[100]; 
    int i=0;

    public static void main(String[] args) {

        Decimal_to_binary obj = new Decimal_to_binary();
        
        System.out.print("Enter the Decimal number : ");
        obj.input();

        obj.d2b();
        System.out.print("Binary number : ");
        obj.print();

    }

    private int input(){
        return decimalNu = sc.nextInt();
    }

    private int d2b(){
        while(true){
            if(decimalNu==0)
                break;
            else{
                binary[i] = decimalNu%2;
                decimalNu = decimalNu/2;
                i++;
            }
        }
        return binary[i];
    }

    private void print(){
        for(int j=i-1; j>=0; j--)
            System.out.print(binary[j]);

        System.out.print("");
    }

}

import java.util.*;

public class converter2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the binary number : ");
        int binary = sc.nextInt();

        int remainder;
        int i=1;
        int decimal = 0;
        boolean say = false;

        while(true){

            if(binary==0)
                break;
            else if(binary%10>1){
                System.out.println("Wrong input...!");
                say = true;
                break;
            }
            else{
                remainder = binary%10;
                decimal += remainder*i;
                binary = binary/10;
                i = i*2;
            }
        }

        if(say==false){
            System.out.println("");
            System.out.print("Decimal : " + decimal);
        }
        
    }
}

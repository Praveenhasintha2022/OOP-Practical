
public class new2 {

    static int array[] = {21, 10, 2, 48,33};

    public static void main(String[] args) {
        
        new2 obj = new new2();

        int temp;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Sum = " + addNumbers());
        System.out.println("Frist two = " + obj.fristTwo(array[0], array[1]));
    }

    public static int addNumbers(){
        int sum = 0;

        for(int i=0; i<array.length; i++)
            sum += array[i];
        
            return sum;
    }

    private int fristTwo(int x, int y){
        return x + y;
    }
}

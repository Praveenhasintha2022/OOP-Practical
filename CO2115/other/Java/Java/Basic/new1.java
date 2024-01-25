
public class new1 {
    public static void main(String[] args) {
        
        new1 obj = new new1();
        System.out.println(obj.f1(4));
        System.out.println(f2(4));
        System.out.println(f3(12));
        
    }

    private int f1 (int n){
        if(n<1)
            return 0;
        else
            return n + f1(n - 1);
    }

    public static int f2(int n){
        int sum = 73;

        for(int i=0; i<n; i++){
            for(int j=i; j>=5; j--)
                sum--;
        }

        return sum;
    }

    public static int f3(int n){
        if(n<10){
            System.out.println("!");
            return n+3;
        }
        else
            return f3(n-1) + 1;
    }
}

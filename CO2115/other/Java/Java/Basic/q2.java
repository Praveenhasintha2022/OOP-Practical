public class q2 {
    
    int top = -1;
    int limit = 10;
    int stack[] = new int[limit];

    public boolean isFull(){
        if(top==limit-1)
            return true;
        else   
            return false;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        else
            return false;
        }
    }

    public static void push(int nu){
        if(!isFull()){
            top++;
            stack[top] = nu;
            System.out.println("Inserted " + nu);
        }
        else
            System.out.println("Stack is full");
    }

    public int pop(){
        if(!isEmpty()){
            int delete = stack[top];
            stack[top] = 0;
            top--;

            return delete;
        }
        else{
            System.out.println("Stack is empty");
            return 0;
        }

    }


    public static void main(String[] args) {
        q2 obj = new q2();

        push(5);
    }

}

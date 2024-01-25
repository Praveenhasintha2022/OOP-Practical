
public class StackInt {
    
    int top = -1;
    int limit = 10;
    int myStack[] = new int[limit];
    
    //insert elements
    public void push(int elt){
        if(!isFull()){
            top++;
            myStack[top] = elt;
            System.out.println("You have interested : " + elt);
        }
        else
            System.out.println("Stack is full...!");
    }
    
    //Remove elements
    public int pop(){
        if(!isEmpty()){
            int popped_elt = myStack[top];
            myStack[top] = 0;
            top--;
            return popped_elt;
        }
        else{
            System.out.println("Stack is empty...!");
            return 0;
        }
    }
    
    //Check wether the stack is full
    public boolean isFull(){
        if(top == limit-1)
            return true;
        else
            return false;
    }
    
    //Check wether the stack is empty
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    
    //print the values in stack
    public void printStack(){

        System.out.print("Stack : ");

        for(int i=0; i<limit; i++){
            if(!isEmpty()){
                System.out.print(myStack[i] + " ");
            }
        }

        System.out.print("");
    }
    
}

public class StackIntMain {
    public static void main(String[] args) {
        StackInt s1 = new StackInt();
        
        s1.push(5);
        s1.push(0);
        System.out.println("Deleted " + s1.pop());
        s1.push(9);
        s1.push(2);
        s1.printStack();
        System.out.println("Deleted " + s1.pop());
        System.out.println("Deleted " + s1.pop());
        System.out.println("Deleted " + s1.pop());
        s1.push(2);
        System.out.println("Deleted " + s1.pop());
        
        //s1.printStack();
        
        //System.out.println(s1.pop());
        //s1.printStack();
        //System.out.println("\n" + s1.pop());
        //s1.printStack();
        //System.out.println(s1.pop());
        //s1.printStack();
        //System.out.println(s1.pop());
        //s1.printStack();
        //System.out.println(s1.pop());
        //s1.printStack();
    }
}


public class InterfaceExampleMain {
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();

        //System.out.println(obj.color);    //can't run in main method
        obj.fillUp();
        System.out.println(obj.bottleNu); 
    }
}

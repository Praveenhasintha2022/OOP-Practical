
public class testMain {
    public static void main(String[] args) {

        test obj = new test(); //creating object for abstract class

        System.out.println("Dog Type : " + obj.breed); //calling variable in abstract class(Dog)
        obj.sound();//calling implemented method in abstract class(Dog)

        obj.run();

    }
}

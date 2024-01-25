
interface waterBottleInterface{
    String color = "Blue";  //can't read in main method

    void fillUp(); 
}

public class InterfaceExample implements waterBottleInterface{
    int bottleNu = 20;
    
    public void fillUp(){
        System.out.println("It is filled.");
    }
}
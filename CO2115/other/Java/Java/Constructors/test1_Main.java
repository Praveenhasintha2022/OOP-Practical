public class test1_Main {

    public static void main(String[] args) {

        test1 obj = new test1();    //Default constructor
        test1 obj2 = new test1(23, "animal", "DCS");    //Parameterized constructor

        System.out.println("Name = " + obj.name);   //run default constructor(output:null)
        System.out.println("Name = " + obj2.name);  
    }
} 

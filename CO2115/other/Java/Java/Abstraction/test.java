
abstract class Dog{
    /*abstract class is a basically a bunch of variables & methods 
    that can be used to create other classes.*/

    String breed = "Army";

    public void sound(){ //normal & implemented method
        System.out.println("Buuuuh..."); 
    }

    public abstract void run(); //This is a abstract method. 
    //It has an idea but don't know what to do
}

class test extends Dog{ 
    //test class extends Dog. He knows everything in Dog. We can use Dog through the test class. 
    public void run(){
        System.out.println("Dog run...!");
    }
}
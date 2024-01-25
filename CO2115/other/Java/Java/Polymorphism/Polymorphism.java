class Polymorphism{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }

    public void fly(){
        System.out.println("can fly.");
    }
}

class Robin extends Polymorphism{
    public void sing(){
        System.out.println("twiddledeede");
    }
}

class Pelican extends Polymorphism{

}
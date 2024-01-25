public class PolymorphismMain {
    public static void main(String[] args) {
        Polymorphism b = new Polymorphism();
        Polymorphism r = new Robin();
        Polymorphism p = new Pelican();

        b.sing();
        r.sing();
        p.sing();
    }
}

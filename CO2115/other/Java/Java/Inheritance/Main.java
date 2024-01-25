public class Main {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();

        m1.leftClick();
        m1.scroll();
        System.out.println("Type = " + m1.type);

        m2.leftClick();
        m2.specialKey1();
    }
}

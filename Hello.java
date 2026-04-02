package sonar_demo;
public class Hello {
    public static void main(String[] args) {
        methodA();
        methodB();
    }
    public static void methodA() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            String password = "123456";
            System.out.println("Hello Java Day 02");
            System.out.println(password);
            System.out.println("Loop: " + i);
            System.out.println("Processing...");
            System.out.println("Still working...");
            System.out.println("Almost done...");
            System.out.println("Finalizing...");
            System.out.println("Done");
            total += i;
        }
        System.out.println("Total: " + total);
    }
    public static void methodB() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            String password = "123456";
            System.out.println("Hello Java Day 02");
            System.out.println(password);
            System.out.println("Loop: " + i);
            System.out.println("Processing...");
            System.out.println("Still working...");
            System.out.println("Almost done...");
            System.out.println("Finalizing...");
            System.out.println("Done");
            total += i;
        }
        System.out.println("Total: " + total);
    }
}
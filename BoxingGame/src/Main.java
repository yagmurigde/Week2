public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter 1", 25, 100, 80, 35);
        Fighter f2 = new Fighter("Fighter 2", 10, 90, 85, 40);
        Match match = new Match(f1, f2, 70,90);
        match.run();
    }
}
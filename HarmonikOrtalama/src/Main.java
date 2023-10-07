public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double total = 0.0;
        for (double number : numbers) {
            total += 1 / number;
        }
        System.out.println("Result:" + numbers.length / total);
    }
}
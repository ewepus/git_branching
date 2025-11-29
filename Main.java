public class Main {
    private static int counter = 1;
    private static int globalCounter = 1;

    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
    }

    public static void doNothing() {
        return;
    }
}

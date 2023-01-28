public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Результат сложения :" + bins.sum("101", "100001"));
        System.out.println("Результат умножения: " + bins.mult("101", "100001"));
    }
}

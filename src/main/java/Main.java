import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int r : new Randoms(80, 100)) {
            System.out.println("Случайное число: " + r);
            TimeUnit.SECONDS.sleep(1);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }

}

import java.util.Random;

class NumberGenerator3 implements Runnable {
    private int number;
    private final Random random = new Random();

    public void run() {
        while (true) {
            number = random.nextInt(100); // Generate a random integer
            System.out.println("Generated Number: " + number);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNumber() {
        return number;
    }
}

class SquareCalculator3 implements Runnable {
    private final NumberGenerator3 numberGenerator;

    public SquareCalculator3(NumberGenerator3 numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        while (true) {
            int number = numberGenerator.getNumber();
            int square = number * number;
            System.out.println("Square: " + square);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubePrinter3 implements Runnable {
    private final NumberGenerator3 numberGenerator;

    public CubePrinter3(NumberGenerator3 numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        while (true) {
            int number = numberGenerator.getNumber();
            int cube = number * number * number;
            System.out.println("Cube: " + cube);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class prog5 {
    public static void main(String[] args) {
        NumberGenerator3 numberGenerator = new NumberGenerator3();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(new SquareCalculator3(numberGenerator));
        Thread thread3 = new Thread(new CubePrinter3(numberGenerator));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

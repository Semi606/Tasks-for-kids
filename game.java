import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Вгадай число від 1 до 100!");
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Введіть своє число: ");
            String input = scanner.nextLine();
            attempts++;
            try {
                int guess = Integer.parseInt(input);
                if (guess < target) {
                    System.out.println("Загадане число більше!");
                } else if (guess > target) {
                    System.out.println("Загадане число менше!");
                } else {
                    System.out.println("Вітаю! Ви вгадали число " + target + " за " + attempts + " спроб.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Це не число! Спробуйте ще раз.");
            }
        }
        scanner.close();
    }
}
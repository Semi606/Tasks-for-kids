import java.util.Scanner;

public class SimpleCalculator {

    // Метод для додавання
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод для віднімання
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод для множення
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для ділення
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Помилка: Ділення на нуль!");
            return Double.NaN; // Повертаємо нечислове значення (NaN)
        }
        return a / b;
    }

    // Основний метод для запуску програми
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Отримуємо введення користувача
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Виберіть операцію (+, -, *, /): ");
        String operation = scanner.next();
        
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        
        // Змінна для зберігання результату
        double result = 0;
        boolean validOperation = true;

        // Виконуємо обрану операцію через відповідний метод
        switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Невірна операція!");
                validOperation = false;
        }

        // Виводимо результат, якщо операція була валідною
        if (validOperation) {
            System.out.println("Результат: " + result);
        }

        // Закриваємо сканер
        scanner.close();
    }
}


// Отримуємо введення користувача
const num1 = parseFloat(prompt("Введіть перше число:"));
const operation = prompt("Виберіть операцію (+, -, *, /):");
const num2 = parseFloat(prompt("Введіть друге число:"));

// Виконуємо операцію на основі введення користувача
let result;
if (operation === "+") {
    result = num1 + num2;
} else if (operation === "-") {
    result = num1 - num2;
} else if (operation === "*") {
    result = num1 * num2;
} else if (operation === "/") {
    if (num2 !== 0) {
        result = num1 / num2;
    } else {
        result = "Помилка: Ділення на нуль!";
    }
} else {
    result = "Невірна операція!";
}

// Виводимо результат
console.log("Результат:", result);

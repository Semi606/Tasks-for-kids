

# Отримуємо введення користувача
num1 = float(input("Введіть перше число: "))
operation = input("Виберіть операцію (+, -, *, /): ")
num2 = float(input("Введіть друге число: "))

# Виконуємо операцію на основі введення користувача
if operation == "+":
    result = num1 + num2
elif operation == "-":
    result = num1 - num2
elif operation == "*":
    result = num1 * num2
elif operation == "/":
    if num2 != 0:
        result = num1 / num2
    else:
        result = "Помилка: Ділення на нуль!"
else:
    result = "Невірна операція!"

# Виводимо результат
print("Результат:", result)

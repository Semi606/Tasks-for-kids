import random

def guess_game():
    print("Вгадай число від 1 до 100!")
    target = random.randint(1, 100)
    attempts = 0

    while True:
        user_input = input("Введи своє число: ")
        try:
            guess = int(user_input)
            attempts += 1
        except ValueError:
            print("Це не число! Спробуй ще раз.")
            continue

        if guess < target:
            print("Загадане число більше!")
        elif guess > target:
            print("Загадане число менше!")
        else:
            print(f"Вітаю! Ви вгадали число {target} за {attempts} спроб.")
            break

guess_game()
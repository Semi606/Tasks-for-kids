function guessGame() {
    console.log("Вгадай число від 1 до 100!");
    const target = Math.floor(Math.random() * 100) + 1;
    let attempts = 0;

    const readline = require('readline').createInterface({
        input: process.stdin,
        output: process.stdout
    });

    function askQuestion() {
        readline.question("Введіть своє число: ", (input) => {
            attempts++;
            const guess = parseInt(input);
            if (isNaN(guess)) {
                console.log("Це не число! Спробуйте ще раз.");
                askQuestion();
            } else if (guess < target) {
                console.log("Загадане число більше!");
                askQuestion();
            } else if (guess > target) {
                console.log("Загадане число менше!");
                askQuestion();
            } else {
                console.log(`Вітаю! Ви вгадали число ${target} за ${attempts} спроб.`);
                readline.close();
            }
        });
    }

    askQuestion();
}

guessGame();
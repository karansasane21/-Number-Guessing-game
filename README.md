# Number Guessing Game in Java

A simple console-based Number Guessing Game implemented in Java.

## Table of Contents

- [Description](#description)
- [How to Play](#how-to-play)
- [Gameplay](#gameplay)
- [Example](#example)
- [Getting Started](#getting-started)
- [License](#license)

## Description

The Number Guessing Game is a classic game where the player tries to guess a randomly generated number within a specified range. This Java implementation provides a straightforward and interactive experience for users.

## How to Play

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/number-guessing-game-java.git
    ```

2. Navigate to the project directory:

    ```bash
    cd number-guessing-game-java
    ```

3. Compile the Java program:

    ```bash
    javac NumberGuessingGame.java
    ```

4. Run the game:

    ```bash
    java NumberGuessingGame
    ```

5. Follow the on-screen instructions to input your guesses and discover the correct number.

## Gameplay

- The game randomly selects a number within a specified range.
- You are prompted to guess the number.
- After each guess, the game provides feedback on whether the guess is too high, too low, or correct.
- The game continues until the correct number is guessed.

## Example

```bash
Welcome to the Number Guessing Game!
I have selected a number between 1 and 100. Try to guess it!

Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 63
Congratulations! You've guessed the correct number in 3 tries.

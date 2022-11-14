package com.lis.game;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    private static final Random RANDOM = new Random();
    private static final String WELCOME_MESSAGE = "Угадайте число от 1 до 100";
    private static final String WIN_MESSAGE = "Вы выйграли";
    private static final String BIGGER_MESSAGE = "Загаданное число больше";
    private static final String LOWER_MESSAGE = "Загаданное число меньше";
    private static final String INVALID_INPUT_MESSAGE = "Введите число от 1 до 100";
    private static final String ATTEMPT_COUNT = "Вы использовали попыток: %s";
    private int number;
    private Scanner scanner = new Scanner(System.in);

    private int stepCounter = 0;
    private boolean inProgress = true;

    public void start() {
        generateNumber();
        getUserInput();
        printMessage(String.format(ATTEMPT_COUNT, stepCounter));
    }

    private void generateNumber() {
        this.number = RANDOM.nextInt(99) + 1;
    }

    private void getUserInput() {
        printMessage(WELCOME_MESSAGE);
        while (inProgress) {
            if (scanner.hasNextInt()) {
                getHandleNumber(scanner.nextInt());
            } else {
                getHandleInCorrect(INVALID_INPUT_MESSAGE);
            }
        }
    }


    private void getHandleNumber(int userNumber) {
        if (validateUserNumber(userNumber)) {
            stepCounter++;
            if (userNumber == this.number) {
                printMessage(WIN_MESSAGE);
                inProgress = false;
            } else {
                showTooltip(userNumber);
            }
        } else {
            getHandleInCorrect(INVALID_INPUT_MESSAGE);
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void showTooltip(int userNumber) {
        if (userNumber < number) {
            printMessage(BIGGER_MESSAGE);
        } else {
            printMessage(LOWER_MESSAGE);
        }
    }

    private boolean validateUserNumber(int userNumber) {
        return userNumber >= 1 && userNumber <= 100;
    }

    private void getHandleInCorrect(String message) {
        printMessage(message);
        scanner.next();
    }
    public int getStepCounter() {
        return stepCounter;
    }
}

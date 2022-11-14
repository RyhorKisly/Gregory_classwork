package com.lis.game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    private  static final String GET_NAME_MESSAGE = "Введите имя: ";
    private  static final String FILE_OUTPUT_MESSAGE = "Игрок: %s, выйграл за %s ходов.\n";
    private static Scanner scanner = new Scanner(System.in);
    private static final String ERROR_MESSAGE = "result wasn't wrote into the file";
    private static final Path PATH_TO_FILE = Paths.get("C:\\Users\\User\\IdeaProjects\\untitled\\src\\com\\lis\\result");
     public static void main(String[] args) {
        String name = getUserName();
        RandomGame game = new RandomGame();
        game.start();
        int countOfSteps = game.getStepCounter();
        writeResultToFile(countOfSteps, name);

    }
    public static void writeResultToFile(int result, String name){
        try {
            Files.writeString(
                    PATH_TO_FILE,
                    String.format(FILE_OUTPUT_MESSAGE, name, result),
                    APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(ERROR_MESSAGE);
        }
    }
     private static String getUserName(){
         System.out.println(GET_NAME_MESSAGE);
         return scanner.next();
     }

}

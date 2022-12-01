package com.lis.prodconsTwoAndTaskPlayer.player.utils;

import com.lis.prodconsTwoAndTaskPlayer.player.exception.WrongPlayerObjectException;
import com.lis.prodconsTwoAndTaskPlayer.player.model.Player;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PlayerUtils {
    private static final Random RANDOM = new Random();
    private static final String NAME_TEMPLATE = "NAME_%s";

    public static List<Player> generatePlayers(int number) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            players.add(
                new Player(
                    generateName(),
                    generateAge(),
                    generateBoolean()
                )
            );
        }
        return players;
    }

    public static void writePlayersToFile(List<Player> players,
                                          String pathToFile) throws IOException {
        FileOutputStream fos = new FileOutputStream(pathToFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(players);
        oos.close();

    }

    public static List<Player> readPlayersFromFile(
        String pathToFile
    ) throws IOException, ClassNotFoundException, WrongPlayerObjectException {
        FileInputStream fis = new FileInputStream(pathToFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        ois.close();
        if (o instanceof List) {
           return (List<Player>) o;
        } else {
            throw new WrongPlayerObjectException("all bad");
        }
    }


    public static Stream<Player> filterByActive(Stream<Player> players,
                                                 boolean state) {
        return players.filter(p -> p.isActive() == state);
    }

    public static Stream<Player> filterByAgeRange(Stream<Player> players,
                                                   int min,
                                                   int max) {
        if (min > max) {
            throw new IllegalArgumentException("min > max");
        }
        return players.filter(p -> {
            int age = p.getAge();
            return age >= min && age <= max;
        });
    }

    public static Stream<Player> sortPlayers(Stream<Player> players,
                                             Comparator<Player> comparator) {
        return players.sorted(comparator);
    }

    public static void printNPlayersInUpperCase(Stream<Player> players, int limit) {
        players
            .limit(limit)
            .map(player -> player.toString().toUpperCase())
            .forEach(System.out::println);
    }

    private static String generateName() {
        return String.format(NAME_TEMPLATE, RANDOM.nextInt(100));
    }

    private static int generateAge() {
        return RANDOM.nextInt(20) + 20;
    }

    private static boolean generateBoolean() {
        return RANDOM.nextBoolean();
    }

}

package com.lis.prodconsTwoAndTaskPlayer.player.service;

import com.lis.prodconsTwoAndTaskPlayer.player.exception.WrongPlayerObjectException;
import com.lis.prodconsTwoAndTaskPlayer.player.model.Player;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static com.lis.prodconsTwoAndTaskPlayer.player.utils.PlayerUtils.*;

public class PlayerRT extends Thread {
    private final String pathToFile;
    private final int minAge;
    private final int maxAge;
    private final boolean state;
    private final int printLimit;

    public PlayerRT(String pathToFile, int minAge, int maxAge, boolean state, int printLimit) {
        this.pathToFile = pathToFile;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.printLimit = printLimit;
        this.state = state;
    }

    @Override
    public void run() {
        try {
            List<Player> players = readPlayersFromFile(pathToFile);
            Stream<Player> stream = filterByActive(players.stream(), state);
            stream = filterByAgeRange(stream, minAge, maxAge);
            Comparator<Player> comparator = Comparator.comparingInt(Player::getAge);
            stream = sortPlayers(stream, comparator);
            printNPlayersInUpperCase(stream, printLimit);
        } catch (IOException e) {
            System.err.println("No file found");
        } catch (ClassNotFoundException e) {
            System.err.println("List contains no player objects");
        } catch (WrongPlayerObjectException e) {
            System.err.println("File not have list of players");
        }
    }
}


//    файл и возвращает коллекцию активных
//    Player в возрастном диапазоне от 25 до 30.
//    Отсортировать по возрасту и вывести на экран имена
//    5 игроков в UpperCase, удовлетворяющие
//    условию с помощью Stream API.


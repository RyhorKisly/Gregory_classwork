package com.lis.prodconsTwoAndTaskPlayer.player.service;

import java.io.IOException;

import static com.lis.prodconsTwoAndTaskPlayer.player.utils.PlayerUtils.generatePlayers;
import static com.lis.prodconsTwoAndTaskPlayer.player.utils.PlayerUtils.writePlayersToFile;


public class PlayerGT extends Thread {
    private final String pathToFile;
    private final int count;

    public PlayerGT(String pathToFile, int count) {
        this.pathToFile = pathToFile;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            writePlayersToFile(generatePlayers(count), pathToFile);
        } catch (IOException e) {
            System.err.println("Can not write to file" + e);
        }
    }
}

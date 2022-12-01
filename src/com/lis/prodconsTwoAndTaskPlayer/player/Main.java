package com.lis.prodconsTwoAndTaskPlayer.player;

import com.lis.prodconsTwoAndTaskPlayer.player.service.PlayerGT;
import com.lis.prodconsTwoAndTaskPlayer.player.service.PlayerRT;

public class Main {
    public static void main(String[] args) {
        String pathToFile = "C:\\Users\\Workstation\\IdeaProjects\\Gregory_classwork\\src\\com\\lis\\prodconsTwoAndTaskPlayer\\player\\players";
        PlayerGT playerGT = new PlayerGT(pathToFile, 10);
        PlayerRT playerRT = new PlayerRT(
            pathToFile, 25, 30, true, 5);
        playerGT.start();
        try {
            playerGT.join();
            playerRT.start();
            playerRT.join();
        } catch (InterruptedException e) {
            System.exit(-1);
        }
    }
}

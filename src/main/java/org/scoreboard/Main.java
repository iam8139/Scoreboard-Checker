package org.scoreboard;

import org.scoreboard.TO.GameEntry;
import org.scoreboard.repository.ScoreboardRepo;
import org.scoreboard.service.ScoreboardService;
import org.scoreboard.serviceImpl.ScoreboardServiceImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ScoreboardService scoreboardService = new ScoreboardServiceImpl(2);
        scoreboardService.addScore(new GameEntry("Kargil", 10));
        scoreboardService.addScore(new GameEntry("Anand", 12));
        scoreboardService.addScore(new GameEntry("Anurag", 14));
        scoreboardService.deleteScore(2);
    }
}
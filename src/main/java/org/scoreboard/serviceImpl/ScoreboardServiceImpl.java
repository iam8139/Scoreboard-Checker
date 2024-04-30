package org.scoreboard.serviceImpl;

import org.scoreboard.TO.GameEntry;
import org.scoreboard.repository.ScoreboardRepo;
import org.scoreboard.repositoryImpl.ScoreboardRepoImpl;
import org.scoreboard.service.ScoreboardService;

public class ScoreboardServiceImpl implements ScoreboardService {
    private final ScoreboardRepo scoreboardRepo;

    public ScoreboardServiceImpl(int capacity) {
        scoreboardRepo = new ScoreboardRepoImpl(capacity);
    }

    @Override
    public void addScore(GameEntry e) {
        scoreboardRepo.addScore(e);
    }

    @Override
    public GameEntry deleteScore(int i) {
        return scoreboardRepo.deleteScore(i);
    }
}

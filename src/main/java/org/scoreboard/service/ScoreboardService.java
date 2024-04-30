package org.scoreboard.service;

import org.scoreboard.TO.GameEntry;

public interface ScoreboardService {
    void addScore(GameEntry e);
    GameEntry deleteScore(int i);
}

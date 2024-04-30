package org.scoreboard.repository;

import org.scoreboard.TO.GameEntry;

public interface ScoreboardRepo {
    void addScore(GameEntry e);
    GameEntry deleteScore(int i);
}

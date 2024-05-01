package org.scoreboard.repositoryImpl;

import org.scoreboard.TO.GameEntry;
import org.scoreboard.repository.ScoreboardRepo;

public class ScoreboardRepoImpl implements ScoreboardRepo {
    private int numEntries = 0;
    private GameEntry[] scoreboard;
    public ScoreboardRepoImpl(int capacity) {
        scoreboard = new GameEntry[capacity];
    }

    @Override
    public void addScore(GameEntry e) {
        System.out.println("numEntries: " + numEntries + " capacity: "+ scoreboard.length);
        if (numEntries < scoreboard.length || e.getScore() > scoreboard[numEntries-1].getScore()) {
            if (numEntries < scoreboard.length) numEntries++;
            int j = numEntries - 1;
            while (j > 0 && scoreboard[j-1].getScore() < e.getScore()) {
                scoreboard[j] = scoreboard[j-1];
                j--;
            }
            scoreboard[j] = e;
            System.out.println("New Entry added: " + e.toString());
        }
    }

    @Override
    public GameEntry deleteScore(int i) {
        if (i < 0 || i > numEntries-1) throw new IndexOutOfBoundsException("Index out of bound");
        GameEntry temp = scoreboard[i];
        for (int j = i; j < numEntries-1; j++) {
            scoreboard[j] = scoreboard[j+1];
        }
        scoreboard[numEntries-1] = null;
        numEntries--;
        System.out.println("Entry deleted: " + temp);
        return temp;
    }

}

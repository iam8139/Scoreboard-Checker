package org.scoreboard;

import org.scoreboard.TO.GameEntry;
import org.scoreboard.repository.ScoreboardRepo;
import org.scoreboard.service.ScoreboardService;
import org.scoreboard.serviceImpl.ScoreboardServiceImpl;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ScoreboardService scoreboardService = new ScoreboardServiceImpl(2);
        scoreboardService.addScore(new GameEntry("Kargil", 10));
        scoreboardService.addScore(new GameEntry("Anand", 12));
        scoreboardService.addScore(new GameEntry("Anurag", 14));
//        scoreboardService.deleteScore(2);

        Main main = new Main();
        int[] arr = {3,4,2,1,89,65,34};
        main.insertion_sort(arr);
        Arrays.stream(arr).forEach(ele -> System.out.println("Array Element: " + ele));

        int[] arr2 = new int[5];
        Arrays.fill(arr2, 3);
        Arrays.stream(arr2).forEach(ele -> System.out.println("Array Element: " + ele));

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 20));

        String s = "kargil";
        char[] sArr = s.toCharArray();

        String newS = new String(sArr);
        System.out.println("new String: " + newS);
    }

    private void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            while (j < i) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
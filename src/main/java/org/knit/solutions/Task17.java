package org.knit.solutions;

import java.text.DecimalFormat;
import java.util.Random;

import org.knit.TaskDescription;

@TaskDescription(taskNumber = 17, taskDescription = "Задача 17 Реализация и проверка парадокса Монти Холла", href = "org.knit.solutions.task17")
public class Task17 implements Solution {

    private static Random rnd = new Random();
    private static final int EXP_COUNT = 1_000_000;
    private static final int DOORS_COUNT = 3;
    private static double change_sel_count = 0;
    private static double unchanged_sel_count = 0;

    @Override
    public void execute() {
        for (int i = 0; i < EXP_COUNT; i++) {
            experiment();
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Количество итераций: " + EXP_COUNT);
        System.out.println("С изменениями выбора: " + df.format((change_sel_count / EXP_COUNT) * 100) + "%");
        System.out.println("Без изменений выбора: " + df.format((unchanged_sel_count / EXP_COUNT) * 100) + "%");
    }

    private void experiment() {
        int[] doors = GenerateDoors();
        int playerChoice = playerChoice();
        int[] doorsWithRemove = removeDoor(doors, playerChoice);
        if (doors[playerChoice] == 1) {
            unchanged_sel_count++;
        } else {
            change_sel_count++;
        }
    }

    private static int prizeDoor() {
        return rnd.nextInt(DOORS_COUNT);
    }

    private static int playerChoice() {
        return rnd.nextInt(DOORS_COUNT);
    }

    private static int[] GenerateDoors() {
        int[] doors = new int[]{0, 0, 0};
        doors[prizeDoor()] = 1;
        return doors;
    }

    private static int[] removeDoor(int[] doors, int playerChoice) {
        int[] doorsChanged = new int[doors.length - 1];
        int iter = 0;
        for (int i = 0; i < DOORS_COUNT; i++) {
            if (i != playerChoice) {
                doorsChanged[iter] = doors[i];
                iter++;
            }
        }
        return doorsChanged;
    }
}

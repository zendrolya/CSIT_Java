package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.lab2_4.task13.*;

@TaskDescription(taskNumber = 13, taskDescription = "Задача 13: Реализация системы команд для управления умным домом", href = "org.knit.solutions.task13")
public class Task13 implements Solution {
    @Override
    public void execute() {
        SmartHome smartHome = new SmartHome();
        RemoteControl controller = new RemoteControl();

        Command SwitchOnLight = new SwitchOnLight(smartHome);
        Command SwitchOffLight = new SwitchOffLight(smartHome);
        Command SwitchOnTV = new SwitchOnTV(smartHome);
        Command SwitchOffTV = new SwitchOffTV(smartHome);

        System.out.println("\nУмный дом получил команды:");
        controller.executeCommand(SwitchOnLight);
        controller.executeCommand(SwitchOnLight);
        controller.executeCommand(SwitchOffLight);
        controller.executeCommand(SwitchOnTV);
        controller.executeCommand(SwitchOnTV);
        controller.executeCommand(SwitchOffTV);
        controller.executeCommand(SwitchOffTV);

        System.out.println("\nОтменяем 2 последние команды:");
        controller.undoLastCommand();
        controller.undoLastCommand();
    }
}
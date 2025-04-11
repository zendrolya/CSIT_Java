package org.knit.solutions.lab2_4.task13;

public class SwitchOnTV implements Command {
    private final SmartHome smartHome;

    public SwitchOnTV(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void execute() {
        smartHome.SwitchOnTV();
    }

    @Override
    public void undo() {
        smartHome.SwitchOffTV();
    }
}
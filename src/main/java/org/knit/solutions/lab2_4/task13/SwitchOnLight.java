package org.knit.solutions.lab2_4.task13;

public class SwitchOnLight implements Command  {
    private final SmartHome smartHome;

    public SwitchOnLight(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void execute() {
        smartHome.SwitchOnLight();
    }

    @Override
    public void undo() {
        smartHome.SwitchOffLight();
    }
}

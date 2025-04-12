package org.knit.solutions.lab2_4.task13;

public class SwitchOffLight implements Command  {
    private final SmartHome smartHome;

    public SwitchOffLight(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    @Override
    public void execute() {
        smartHome.SwitchOffLight();
    }

    @Override
    public void undo() {
        smartHome.SwitchOnLight();
    }
}

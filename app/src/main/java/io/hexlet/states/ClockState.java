package io.hexlet.states;

import io.hexlet.AlarmClock;

public class ClockState implements State{

    public String stateName = "clock";

    @Override
    public void switchDisplayMode(AlarmClock clock) {
        clock.switchDisplayMode();
    }

    @Override
    public void switchAlarmMode(AlarmClock clock) {

    }

    @Override
    public void turnOffAlarmSound(AlarmClock clock) {

    }

    @Override
    public void incrementHour(AlarmClock clock) {

    }

    @Override
    public void incrementMinute(AlarmClock clock) {

    }

    @Override
    public String getStateName() {
        return this.stateName;
    }
}

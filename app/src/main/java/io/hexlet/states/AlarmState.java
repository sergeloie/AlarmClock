package io.hexlet.states;

import io.hexlet.AlarmClock;

public class AlarmState implements State {

    String stateName = "alarm";

    @Override
    public void switchDisplayMode(AlarmClock clock) {

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

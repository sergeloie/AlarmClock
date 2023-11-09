package io.hexlet.states;

import io.hexlet.AlarmClock;

public class AlarmState implements State {

    String stateName = "alarm";

    @Override
    public void switchState(AlarmClock clock) {

    }

    @Override
    public void incrementHour(AlarmClock clock) {

    }

    @Override
    public void incrementMinute(AlarmClock clock) {

    }

    @Override
    public String getStateName() {
        return stateName;
    }

    public void clickMode(AlarmClock clock) {
        System.out.println("set state to Clock");
        clock.setState(new ClockState());
    }
}

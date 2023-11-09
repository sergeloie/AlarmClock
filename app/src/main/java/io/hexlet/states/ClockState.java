package io.hexlet.states;

import io.hexlet.AlarmClock;

public class ClockState implements State{

    public String stateName = "clock";

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

    @Override
    public void clickMode(AlarmClock clock) {
        System.out.println("set state to Alarm");
        clock.setState(new AlarmState());
    }
}

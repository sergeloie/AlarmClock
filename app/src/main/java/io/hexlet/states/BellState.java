package io.hexlet.states;

import io.hexlet.AlarmClock;

public class BellState implements State{

    String stateName = "bell";

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
        return this.stateName;
    }

    @Override
    public void clickMode(AlarmClock clock) {
        System.out.println("set state to Clock");
        clock.setState(new ClockState());
    }

    @Override
    public void clickH(AlarmClock clock) {}

    @Override
    public void clickM(AlarmClock clock) {}
}
